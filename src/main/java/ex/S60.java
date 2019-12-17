package ex;

public class S60 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}

		return sb.toString();

	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		int len = s.length();
		for (int i = 0; i < len / 2; i++) { // parto dalla posizione 0 e arrivo a metà avanzando in avanti
			if (s.charAt(i) != s.charAt(len - 1 - i)) { // se il carattere in posizione i è diverso dal carattere che
														// parte dal fondo (len-1) e scala all'indietro (-i)

				return false; // allora non è palindromo
			}
		}
		return true; // in caso contrario è palindromo
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
		StringBuilder sb = new StringBuilder(); //creo una copia, stringbuilder
		for (int i = 0; i < s.length(); i++) { //percorro tutta la lunghezza della stringa carattere per carattere
			char c = s.charAt(i); //definisco l'indice charAt(i)
			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') { //se il carattere che guardo non ha a,e,i,o,u
				sb.append(c); //aggiungo c alla stringa
			}

		}
		return sb.toString();//converto lo stringbuilder in una stringa
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		// TODO
		return 0;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[0];

		// TODO

		return result;
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		// TODO
		return 0;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		// TODO
		return 0;
	}
}
