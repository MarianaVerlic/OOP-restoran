package restoran1;

public class Klijent {
	private String ime;
	private String prezime;
	private String adresa;
	private String mobilniTelefon;
	
	public Klijent(){}
	
	public Klijent(String ime, String prezime, String adresa, String mobilniTelefon) {
		this.ime=ime;
		this.prezime=prezime;
		this.adresa=adresa;
		this.mobilniTelefon=mobilniTelefon;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getMobilniTelefon() {
		return mobilniTelefon;
	}

	public void setMobilniTelefon(String mobilniTelefon) {
		this.mobilniTelefon = mobilniTelefon;
	}

	@Override
	public String toString() {
		return "Klijent [ime=" + ime + ", prezime=" + prezime + ", adresa=" + adresa + ", mobilniTelefon="
				+ mobilniTelefon + "]";
	}
	
	
	
	
}
