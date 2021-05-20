package restoran1;

public class Narudzbina {
	private String nazivJela;
	private int brojPorcija;
	private Klijent klijent;
	private boolean realizovano;
	
	public Narudzbina () {}
	
	public Narudzbina(String nazivJela, int brojPorcija, Klijent klijent, boolean realizovano) {
		super();
		this.nazivJela = nazivJela;
		this.brojPorcija=brojPorcija;
		this.klijent = klijent;
		this.realizovano = realizovano;
	}

	public String getNazivJela() {
		return nazivJela;
	}

	public void setNazivJela(String nazivJela) {
		this.nazivJela = nazivJela;
	}
	public int getBrojPorcija() {
		return brojPorcija;
	}

	public void setBrojPorcija(int brojPorcija) {
		this.brojPorcija = brojPorcija;
	}
	
	public Klijent getKlijent() {
		return klijent;
	}

	public void setKlijent(Klijent klijent) {
		this.klijent = klijent;
	}

	public boolean isRealizovano() {
		return realizovano;
	}

	public void setRealizovano(boolean realizovano) {
		this.realizovano = realizovano;
	}

	@Override
	public String toString() {
		return "Narudzbina [nazivJela=" + nazivJela + ", brojPorcija=" + brojPorcija + ", klijent=" + klijent
				+ ", realizovano=" + realizovano + "]";
	}

	
	
	
	
	

}
