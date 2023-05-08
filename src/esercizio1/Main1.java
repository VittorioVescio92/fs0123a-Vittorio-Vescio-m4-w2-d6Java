package esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import esercizio1.exceptions.From1To10Exception;

public class Main1 {

	public static void main(String[] args) {
		int[] randomInt = new int[5];
		Random r = new Random();
		for (int i = 0; i < randomInt.length; i++) {
			randomInt[i] = r.nextInt(1, 11);
		}
		int quit = 1;
		Scanner scan = new Scanner(System.in);
		while (quit != 0) {
			System.out.println(Arrays.toString(randomInt));
			System.out.println("Scrivi quale posizione dell'array intendi modificare");
			int indexSelected = scan.nextInt();
			if (indexSelected > 0) {
				switch (indexSelected) {
				case 1:
					System.out.println("Che valore vuoi inserire?");
					try {
						int indexValue = scan.nextInt();
						if (indexValue < 0 || indexValue > 10) {
							throw new From1To10Exception("Devi inserire un valore compreso tra 1 e 10");
						} else {
							randomInt[0] = indexValue;
						}
					} catch (From1To10Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 2:
					System.out.println("Che valore vuoi inserire?");
					try {
						int indexValue = scan.nextInt();
						if (indexValue < 0 || indexValue > 10) {
							throw new From1To10Exception("Devi inserire un valore compreso tra 1 e 10");
						} else {
							randomInt[1] = indexValue;
						}
					} catch (From1To10Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 3:
					System.out.println("Che valore vuoi inserire?");
					try {
						int indexValue = scan.nextInt();
						if (indexValue < 0 || indexValue > 10) {
							throw new From1To10Exception("Devi inserire un valore compreso tra 1 e 10");
						} else {
							randomInt[2] = indexValue;
						}
					} catch (From1To10Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 4:
					System.out.println("Che valore vuoi inserire?");
					try {
						int indexValue = scan.nextInt();
						if (indexValue < 0 || indexValue > 10) {
							throw new From1To10Exception("Devi inserire un valore compreso tra 1 e 10");
						} else {
							randomInt[3] = indexValue;
						}
					} catch (From1To10Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 5:
					System.out.println("Che valore vuoi inserire?");
					try {
						int indexValue = scan.nextInt();
						if (indexValue < 0 || indexValue > 10) {
							throw new From1To10Exception("Devi inserire un valore compreso tra 1 e 10");
						} else {
							randomInt[4] = indexValue;
						}
					} catch (From1To10Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				default:
//					quit = 0;
					System.out.println("Inserisci un valore da 1 a 5!");
					break;
				}
			} else {
				System.out.println("Applicazione in chiusura, grazie per averla utilizzata!");
			}
		}
		System.out.println("prova");
		scan.close();
	}
}
