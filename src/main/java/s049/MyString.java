package s049;

public class MyString {
	static int compareTo(String s, String t) {

		int lengthS = s.length(); // dobbiamo prima vedere quale stringa ha una lunghezza minore, perchè per la
									// comparazione non c'è bisogno di andare oltre gli indici di quello più
									// piccolo, non ci sarebbe nulla con cui comparare
		int lengthT = t.length();
		int minLength = 0;

		if (lengthS < lengthT) {
			minLength = lengthS;
		} else {
			minLength = lengthT;
		}

		for (int i = 0; i < minLength; i++) {

			if (s.charAt(i) < t.charAt(i)) {// il metodo charAt è quello corrispondente alle [] degli array. dice "vammi
											// a prendere il carattere in quella posizione"
				return (-1);// negativo è quando la prima comparazione viene prima in ordine alfabetico
			} else if (s.charAt(i) > t.charAt(i)) {
				return (1);// positivo è quando la seconda comparazione viene prima in ordine alfabetico
			}
		}
		if (lengthS == lengthT) {
			return 0;
		} else if (lengthS < lengthT) {
			return -1;
		} else {
			return +1;

		}
	}

	public static void main(String[] args) {
		String s1 = "hello";
		String t1 = "world";

		int result1 = compareTo(s1, t1); // La mia compare ti prende due parametri, s e t. visto che il metodo è
											// statico, non c'è la stringa corrente e passo entrambe le stringhe come
											// parametri

		System.out.println("hello vs world result is" + result1);

		String s2 = "hello";
		String t2 = "hello";

		int result2 = compareTo(s2, t2);

		System.out.println("hello vs world result is" + result2);

		String s3 = "hello";
		String t3 = "hell";

		int result3 = compareTo(s3, t3);

		System.out.println("hello vs world result is" + result3);

	}

}
