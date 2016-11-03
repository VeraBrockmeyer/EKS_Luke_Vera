package aufgabe1;

public class Osterpaket extends Geschenkpaket{

	@Override
	public Gutschein erzeugeGutschein() {
		return new CDGutschein(15);
	}

	@Override
	public Werbegeschenk erzeugeWerbegeschenk() {
		return new Osterhase();
	}
	
}