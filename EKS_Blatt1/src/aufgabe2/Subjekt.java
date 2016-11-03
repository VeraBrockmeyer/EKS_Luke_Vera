package aufgabe2;

import java.util.ArrayList;

public abstract class Subjekt {
	ArrayList<Beobachter> beobachter;
	
	public void meldeAn(Beobachter b){
		beobachter.add(b);
	}
	
	public void meldeAb(Beobachter b){
		beobachter.remove(b);
	}
	
	public void benachrichtige(){
		for (Beobachter b : beobachter) {
			b.aktualisiere();
		}
	}
}
