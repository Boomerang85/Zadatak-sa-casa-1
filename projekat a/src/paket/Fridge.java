package paket;

public class Fridge 
{
	private int kobasica;
	private int sir;
	private boolean ima;
	
	public Fridge()
	{
		
	}
	
	public Fridge(int kobasica, int sir)
	{
		this.kobasica = kobasica;
		this.sir = sir;
	}
	
	public Fridge(int kobasica, int sir, boolean ima)
	{
		this.kobasica = kobasica;
		this.sir = sir;
		this.ima = ima;
	}
	
	public double distance(int kobasica2, int sir2)
	{
		int dkobasica = kobasica2 - kobasica;
		int dsir = sir2 - sir;
		double d = Math.sqrt(dkobasica * dkobasica + dsir * dsir);
		return d;
	}

	public int getKobasica() {
		return kobasica;
	}

	public void setKobasica(int kobasica) {
		this.kobasica = kobasica;
	}

	public int getSir() {
		return sir;
	}

	public void setSir(int sir) {
		this.sir = sir;
	}

	public boolean isIma() {
		return ima;
	}

	public void setIma(boolean ima) {
		this.ima = ima;
	}

	
	
	
}
