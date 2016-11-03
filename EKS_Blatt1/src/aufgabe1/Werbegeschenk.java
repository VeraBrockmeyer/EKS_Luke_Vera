package aufgabe1;

public abstract class Werbegeschenk{
	protected String art;
	public Werbegeschenk(String art) {
		this.art = art;
		}
	public abstract String getArt();
}