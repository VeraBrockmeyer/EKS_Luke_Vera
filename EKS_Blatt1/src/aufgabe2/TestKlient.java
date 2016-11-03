package aufgabe2;

public class TestKlient {

	public static void main(String[] args) {
		Einkaufsliste ekl = new Einkaufsliste();
		WebDarstellung wd = new WebDarstellung(ekl);
		Rechnung rechnung = new Rechnung(ekl);
		ekl.meldeAn(wd);
		ekl.meldeAn(rechnung);
		ekl.addArtikel(new CD(25, "CD3"));
		ekl.addArtikel(new CD(8, "CD4"));
		ekl.addArtikel(new DVD(145, "DVD2"));
		ekl.entferneArtikel(ekl.getArtikel("CD4"));
		ekl.entferneArtikel(ekl.getArtikel("CD3"));
		ekl.addArtikel(new Buch(16, "Buch4"));
		ekl.addArtikel(new CD(8, "CD4"));
		ekl.addArtikel(new Buch(76, "Buch 5"));
	}

}
