public class Weihnachtspaket extends Geschenkpaket{

	@Override
	public Gutschein erzeugeGutschein() {
		return new CDGutschein(20);
	}

	@Override
	public Werbegeschenk erzeugeWerbegeschenk() {
		return new Weihnachtsmann();
	}
	
}