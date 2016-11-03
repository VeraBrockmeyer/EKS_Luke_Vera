public class Familienpaket extends Geschenkpaket{

	@Override
	public Gutschein erzeugeGutschein() {
		return new DVDGutschein(25);
	}

	@Override
	public Werbegeschenk erzeugeWerbegeschenk() {
		return new Fussball();
	}
	
}