package s044;

// trovare 1 e 7 nell'array e in che posizione sono

public class esercizio4 {

	public static void main(String[] args) {

		int[] array = { 5, 7, 1, 3, 4 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				System.out.println("there's a 1 in position " + i);
			} else if (array[i] == 7) {
				System.out.println("there's a 7 in position " + i);
			} /*else {
				System.out.println("there are not 1 or 7 in position " + i);
			}*/
		}
	}

}
