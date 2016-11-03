package aufgabe1;

public class DVDGutschein extends Gutschein{

	public DVDGutschein(float wert) {
		super(wert);
	}

	@Override
	public float getWert() {
		return wert;
	}
	
}