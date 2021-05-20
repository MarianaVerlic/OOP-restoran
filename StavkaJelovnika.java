package restoran1;

public class StavkaJelovnika {
	private String nazivJela;
	private String tipJela;
	private double cena;
	
	public StavkaJelovnika() {}
	
	public StavkaJelovnika(String nazivJela, String tipJela, double cena) {
		super();
		this.nazivJela = nazivJela;
		this.tipJela = tipJela;
		this.cena = cena;
	}

	public String getNazivJela() {
		return nazivJela;
	}

	public void setNazivJela(String nazivJela) {
		this.nazivJela = nazivJela;
	}

	public String getTipJela() {
		return tipJela;
	}

	public void setTipJela(String tipJela) {
		this.tipJela = tipJela;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "StavkaJelovnika [nazivJela=" + nazivJela + ", tipJela=" + tipJela + ", cena=" + cena + "]";
	}
	
	
	

}
