package aufgabe2;

import java.util.ArrayList;

public class Rechnung extends Beobachter{
	
	public Rechnung(Einkaufsliste ekl){
		this.ekl = ekl;
		artikel = new ArrayList<Artikel>();
	}
	
	@Override
	public void aktualisiere() {
		artikel = ekl.gibZustand();
		float gesamtPreis = 0.0f;
		for (Artikel a : artikel) {
			gesamtPreis += a.getPreis();
		}
		System.out.println("Gesamtpreis: " + gesamtPreis);
	}

}
