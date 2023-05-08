package esercizio3;

import esercizio3.conto.ContoCorrente;
import esercizio3.conto.ContoOnline;
import esercizio3.exceptions.BancaException;

public class Banca {

	public static void main(String args[]) {
		ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);

		System.out.println("Saldo iniziale conto1: " + conto1.restituisciSaldo());

		try {
			conto1.preleva(21000);

			System.out.println("Saldo conto 1: " + conto1.restituisciSaldo());

		} catch (BancaException e) {
			System.out.println("Errore durante il prelievo: " + e);
			e.printStackTrace();
		}

		ContoOnline conto2 = new ContoOnline("Rossi Luigi", 50350.0, 1500);

		conto2.stampaSaldo();

		try {
			conto2.preleva(1500);
			conto2.preleva(1000);

			conto2.stampaSaldo();
		} catch (BancaException e) {
			System.out.println("Errore durante il prelievo: " + e);
			e.printStackTrace();
		}

	}

}
