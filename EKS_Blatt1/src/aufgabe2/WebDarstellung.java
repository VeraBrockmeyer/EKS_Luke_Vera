package aufgabe2;

import java.util.ArrayList;

public class WebDarstellung extends Beobachter{
	
	public WebDarstellung(Einkaufsliste ekl){
		this.ekl = ekl;
		artikel = new ArrayList<Artikel>();
	}
	
	@Override
	public void aktualisiere() {
		ArrayList<Artikel> neueListe;
		neueListe = (ArrayList<Artikel>) ekl.gibZustand().clone();
		if(neueListe.size() > artikel.size()){
			System.out.println("Hinzugefügter Artikel: " + neueListe.get(neueListe.size() - 1).toString());
		}else if(neueListe.size() < artikel.size()){
			for (Artikel a : artikel) {
				if(!neueListe.contains(a)){
					System.out.println("Entfernter Artikel: " + a.toString());
					break;
				}
			}
		}
		artikel = neueListe;
	}

}
