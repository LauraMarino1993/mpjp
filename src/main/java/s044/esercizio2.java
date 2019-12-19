package s044;

//dato un array di interi, trovare quanti sono pari e sommare tra loro i dispari

public class esercizio2 {
	public static void main(String[] args) {
		int[] array = { 7, 3, 1, 2, 4, 8, };
		int counter = 0;
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				counter = counter + 1;
			else
				sum+= array[i]; //alias sum=array[i]+sum 
		}

		System.out.println(counter);
		System.out.println(sum);
	}

}
 