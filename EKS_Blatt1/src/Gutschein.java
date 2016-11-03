public abstract class Gutschein{
	protected float wert;
	
	public Gutschein(float wert){
		this.wert = wert;
	}
	
	public abstract float getWert();
}