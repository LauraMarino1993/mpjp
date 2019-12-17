package ex;

public class S59 {
	// sommare i valori compresi tra un primo e un ultimo numero, solo se il first è
	// minore di last, altrimenti 0
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		long result = 0; // lo trasformo in long da int per evitare l'overflow

		if (first > last) {
			return 0;
		}
		for (int current = first; current <= last; current++) {
			result += current; // result=result+current

		}

		return result;
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		long result = 0;

		if (first > last) {
			return 0;
		}

		for (int current = first; current <= last; current++) {
			if (current % 2 == 0) {
				result += current;
			}
		}
		return result;
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) { // es value=8 fattoriale= 1*2*3*4*5*6*7*8
		long result = 1;

		if (value < 0) {
			return 0;
		} else {
			for (int current = 2; current <= value; current++) {
				result *= current;
			}
			return result;
		}
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		if (value <= 0) {
			return 0;
		}
		if (value == 1 || value == 2) {
			return 1;
		}

		long current = 2; // fibonacci di 3 è 2
		long prev = 1;
		for (int i = 4; i <= value; i++) {//4: parto da fibonacci di 4
			long temp = current;
			current += prev;
			prev = temp;
		}

		return current;

	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[0][0];

	    for (int i=0; i<value; i++) {
	    	for (int j=0; j<value; j++) {
	    		result [i][j]= (i+1)*(j+1);
	    	}
	    	return result;
	    }

		return result;
	}
}
