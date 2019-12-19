package s044;

//dato un array di interi, trovare quanti sono pari

public class esercizio3 {
	public static void main(String[] args) {
		int[] array = { 7, 3, 1, 2, 4, 8, };
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				counter = counter + 1;
		}

		System.out.println(counter);
	}

}
 