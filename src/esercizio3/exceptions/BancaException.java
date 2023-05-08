package esercizio3.exceptions;

public class BancaException extends Exception {

	public BancaException(String message) {
		super(message);
		toString(message);
	}

	public String toString(String string) {
		return string;
	}
}