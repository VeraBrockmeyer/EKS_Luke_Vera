package aufgabe2;

public abstract class Artikel{
	private float preis;
	private String name;
	
	public Artikel(float preis, String name){
		this.preis = preis;
		this.name = name;
	}

	protected float getPreis(){
		return preis;
	}
	
	public String toString(){
		return "Name: " + name + ", Preis: " + preis;
	}
	
	public String getName(){
		return name;
	}
}