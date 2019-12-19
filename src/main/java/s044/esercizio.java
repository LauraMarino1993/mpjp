package s044;

//dati un array di interi, trovare il valore minimo
public class esercizio {
	public static void main(String[] args) {
		int[] array = { 3, 5, 1, 7 };
		int min = array [0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i]; }

		}	
		
		System.out.println(min);

	}

}
