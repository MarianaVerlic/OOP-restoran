package restoran1;

import java.io.IOException;

public class RestoranMain {

	public static void main(String[] args) throws IOException{
		
		Klijent k1 = new Klijent ("Aleksandra", "Misan", "Mise_Dimitrijevica_52", "063555333");
		Klijent k2 = new Klijent ("Neda", "Divjakovic", "Bul.Oslobodjenja_33", "0654356667");
		StavkaJelovnika s1 = new StavkaJelovnika("Cezar_salata", "salata", 280);
		StavkaJelovnika s2 = new StavkaJelovnika("Sopska_salata", "salata", 150);
		Narudzbina n1=new Narudzbina("Krempita", 4, k2, true);
		Narudzbina n2 = new Narudzbina("Teleci_medaljoni", 2, k1, true);
		
		SpisakKlijenata spisakKlijenata =new SpisakKlijenata();
		SpisakNarudzbina spisakNarudzbina = new SpisakNarudzbina();
		Jelovnik jelovnik = new Jelovnik();
		
		
		
		spisakKlijenata.ucitajIzFajla("klijenti.txt");
		spisakKlijenata.stampajSpisak();
		spisakKlijenata.upisiListu("klijentiIspis.txt");
        spisakKlijenata.dodajKlijenta(k1);
		spisakKlijenata.stampajSpisak();
		spisakKlijenata.izbrisiKlijenta(k1);
		spisakKlijenata.stampajSpisak();
		spisakKlijenata.nadjiKlijenta("0678899004");
		
		jelovnik.ucitajIzFajla("jelovnik.txt");
		jelovnik.stampajJelovnik();
		jelovnik.dodajStavku(s1);
		jelovnik.stampajJelovnik();
		jelovnik.izbrisiStavku("Sopska_salata");
		jelovnik.stampajJelovnik();
		jelovnik.upisiListu("jelovnikIzlaz.txt");
		
		
		spisakNarudzbina.dodajNarudzbinu(n1);
		spisakNarudzbina.dodajNarudzbinu(n2);
		spisakNarudzbina.stampajSpisak();
		spisakNarudzbina.upisiListu("narudzbine1.txt");

		
	}

}
