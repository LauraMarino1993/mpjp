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
		StringBuilder sb = new StringBuilder(); // creo una copia, stringbuilder
		for (int i = 0; i < s.length(); i++) { // percorro tutta la lunghezza della stringa carattere per carattere
			char c = s.charAt(i); // definisco l'indice charAt(i)
			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') { // se il carattere che guardo non ha
																			// a,e,i,o,u
				sb.append(c); // aggiungo c alla stringa
			}

		}
		return sb.toString();// converto lo stringbuilder in una stringa
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
		int[] result = new int[data.length];
		int j=0; //creo un nuovo indice per il secondo array
		for (int i=data.length-1; i>=0; i--) { //parto dall'ultima posizione di data (data.length-1), fino ad arrivare alla posizione 0
			result [j] = data[i];
			j++; //copro tutto l'array
		}

		return result;
		
		/* altra possibilità: l'operatore virgola. inizializzo più di una variabile di loop all'interno del mio for. 
		 * posso farlo solo se le variabili sono dello stesso tipo:
		 * for (int i=data.length-1, j=0; i>=0; i--,j++){
		 * result[i]= data[data.length-1-i];
		 */
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average CALCOLARE LA MEDIA: attenzione però perchè bisogna tener
	 *         conto che la media possa essere decimale quindi il return type dovrà
	 *         essere un double
	 */
	public static double average(int[] data) {
		double sum = 0; // creo direttamente una variabile double in modo da poter fare la divisione e
						// quindi la media ovviando al problema di un risultato decimale
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}

		return sum / data.length;
	}

	/*
	 * con il for each: 
	 * for (int cur:data){ 
	 *     sum+=value; 
	 * } 
	 * return sum/data.length;
	 */

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		
		int massimo = Integer.MIN_VALUE; /*per trovare il numero minimo, visto che ci sono anche i negativi, 
		stabilisco che la variabile massimo sia un integer applicando il metodo min.value */
		
		for (int i=0; i<data.length; i++) {
			if (data[i]> massimo) {
				massimo = data[i];
			}
		}
			return massimo;
		}
	   /* con il for each:
	    * for (int cur:data){
	    * if (massimo < cur){
	    * massimo=cur;
	    * }
	    * }
	    */
}

