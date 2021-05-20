package restoran1;

	import java.io.File;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.*;


	public class Jelovnik implements RadSaStavkama {

		ArrayList<StavkaJelovnika>jelovnik = new ArrayList<>();

		public void ucitajIzFajla(String fajl) {

			Scanner s = null;
			ArrayList<StavkaJelovnika> jelovnik = new ArrayList<StavkaJelovnika>();
			try {

				s = new Scanner(new File("jelovnik.txt"));
				do {

					String nazivJela = s.next();
					String tipJela = s.next();
					double cena = s.nextDouble();
					StavkaJelovnika novaStavka = new StavkaJelovnika(nazivJela, tipJela, cena);
					jelovnik.add(novaStavka);

				} while (s.hasNext());
			} catch (IOException e) {

				System.out.println(e.getMessage());
			} finally {

				if (s != null) {
					s.close();

				}

			}
			this.jelovnik = jelovnik;

		}

		@Override
		public void dodajStavku(StavkaJelovnika s) {
			jelovnik.add(s);
		}

		@Override
		public void izbrisiStavku(String nazivJela) {
			jelovnik.remove(nazivJela);

		}

		@Override
		public int nadjiStavku(String nazivJela) {
			for (int i = 0; i < this.jelovnik.size(); i++) 
					if (jelovnik.get(i).getNazivJela().equals(nazivJela))
						return i;
				
				System.out.println("Stavka nije pronadjena!");
				return -1;
			}	

		public void stampajJelovnik() {
			System.out.println(Arrays.toString(this.jelovnik.toArray()));
		}
		
		public void upisiListu(String izlazniFajl) {

			PrintWriter pw = null;
			try {

				pw = new PrintWriter(new FileOutputStream("jelovnikIzlaz.txt"));
				for (StavkaJelovnika stavka : this.jelovnik)

					pw.println(stavka.getNazivJela() + " " + stavka.getTipJela() + " " + stavka.getCena());

			} catch (IOException e) {

				System.out.println(e.getMessage());

			} finally {

				if (pw != null) {
					pw.close();
				}
			}
		}
	}


		
		
		
		
		
		





