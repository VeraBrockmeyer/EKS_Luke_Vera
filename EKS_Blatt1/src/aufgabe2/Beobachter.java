package aufgabe2;

import java.util.ArrayList;

public abstract class Beobachter {
	
	Einkaufsliste ekl;
	ArrayList<Artikel> artikel;
	
	public abstract void aktualisiere();
}
