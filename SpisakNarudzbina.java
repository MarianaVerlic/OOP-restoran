package restoran1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class SpisakNarudzbina {

	ArrayList<Narudzbina> spisakNarudzbina = new ArrayList<>();

	public void dodajNarudzbinu(Narudzbina n) {
		spisakNarudzbina.add(n);
	}

	public void obrisiNarudzbinu(Narudzbina n) {
		spisakNarudzbina.remove(n);

	}

	public int nadjiNarudzbinu(String mobilniTelefon) {
		for (int i = 0; i < this.spisakNarudzbina.size(); i++)
			if (spisakNarudzbina.get(i).getKlijent().getMobilniTelefon().equals(mobilniTelefon))
				return i;

		System.out.println("Narudzbina nije pronadjena!");
		return -1;
	}

	public void stampajSpisak() {
		System.out.println(Arrays.toString(this.spisakNarudzbina.toArray()));
	}

	public void upisiListu(String izlazniFajl) {

		PrintWriter pw = null;
		try {

			pw = new PrintWriter(new FileOutputStream("narudzbine1.txt"));
			for (Narudzbina narudzbina : this.spisakNarudzbina)

				pw.println(narudzbina.getNazivJela() + " " + narudzbina.getBrojPorcija()+ " " + narudzbina.getKlijent() + " " + narudzbina.isRealizovano());

		} catch (IOException e) {

			System.out.println(e.getMessage());

		} finally {

			if (pw != null) {
				pw.close();
			}
		}
	}
}
