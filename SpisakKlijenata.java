package restoran1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class SpisakKlijenata implements RadSaKlijentima {

	ArrayList<Klijent> spisakKlijenata = new ArrayList<>();

	public void ucitajIzFajla(String fajl) {

		Scanner s = null;
		ArrayList<Klijent> spisakKlijenata = new ArrayList<Klijent>();
		try {

			s = new Scanner(new File("klijenti.txt"));
			do {

				String ime = s.next();
				String prezime = s.next();
				String adresa = s.next();
				String mobilniTelefon = s.next();
				Klijent noviKlijent = new Klijent(ime, prezime, adresa, mobilniTelefon);
				spisakKlijenata.add(noviKlijent);

			} while (s.hasNext());
		} catch (IOException e) {

			System.out.println(e.getMessage());
		} finally {

			if (s != null) {
				s.close();

			}

		}
		this.spisakKlijenata = spisakKlijenata;

	}

	@Override
	public void dodajKlijenta(Klijent k) {
		spisakKlijenata.add(k);
	}

	@Override
	public void izbrisiKlijenta(Klijent k) {
		spisakKlijenata.remove(k);

	}

	@Override
	public int nadjiKlijenta(String mobilniTelefon) {
			for (int i = 0; i < this.spisakKlijenata.size(); i++) 
				if (spisakKlijenata.get(i).getMobilniTelefon().equals(mobilniTelefon))
					return i;
			
			System.out.println("Osoba nije pronadjena!");
			return -1;
		}	

	public void stampajSpisak() {
		System.out.println(Arrays.toString(this.spisakKlijenata.toArray()));
	}
	
	public void upisiListu(String izlazniFajl) {

		PrintWriter pw = null;
		try {

			pw = new PrintWriter(new FileOutputStream("klijentiIspis.txt"));
			for (Klijent klijent : this.spisakKlijenata)

				pw.println(klijent.getIme() + " " + klijent.getPrezime() + " " + klijent.getAdresa() + " " + klijent.getMobilniTelefon());

		} catch (IOException e) {

			System.out.println(e.getMessage());

		} finally {

			if (pw != null) {
				pw.close();
			}
		}
	}
}


	
	
	
	
	
	


