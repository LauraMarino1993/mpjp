package codewarskata;

public class Exdivisible {
	public static int[] divisibleBy(int[] numbers, int divider) {
		int counter = 0; // inizializzo la variabile counter per contare quanti elementi ho nell'array
							// divisible, partendo da numbers e vedendo quanti sono divisibili per divider
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % divider == 0) { // se il numero in numbers è divisibile per divider, incremento counter
				counter++;
			}
		}

		int[] divisible = new int[counter]; // ora creo un array che ha come quantità di elementi la quantità derivata
											// da counter

		int pos = 0;// inizializzo la variabile posizione che mi consente di inserire in divisible i
					// numeri che trovo
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % divider == 0) {
				divisible[pos] = numbers[i];// ogni numero divisibile in numbers va in divisible nella posizione
											// corrente
				pos++; // per mettere i numeri in più posizioni, incremento ogni volta pos.
			}

		}

		return divisible;
	}
}
