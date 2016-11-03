package aufgabe2;

import java.util.ArrayList;

public class Einkaufsliste extends Subjekt{
	
	ArrayList<Artikel> artikel;
	
	public Einkaufsliste(){
		artikel = new ArrayList<Artikel>();
		beobachter = new ArrayList<Beobachter>();
	}
	
	public void addArtikel(Artikel a){
		artikel.add(a);
		benachrichtige();
	}
	
	public void entferneArtikel(Artikel a){
		artikel.remove(a);
		benachrichtige();
	}
	
	public Artikel getArtikel(String name){
		for (Artikel a : artikel) {
			if(a.getName().equals(name))
				return a;
		}
		return null;
	}
	
	public ArrayList<Artikel> gibZustand(){
		return artikel;
	}
}