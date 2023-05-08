package esercizio2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci i km percorsi");
		try {
			int km = scan.nextInt();
			System.out.println("Inserisci i litri di carburante consumati");
			int litri = scan.nextInt();
			System.out.println("Il consumo di carburante è pari a: " + kmLitro(km, litri) + " km/l");
		} catch (ArithmeticException e) {
			System.out.println("Devi inserire valori positivi!");
		}

	}

	public static int kmLitro(int km, int litri) {
		return km / litri;
	}

}
