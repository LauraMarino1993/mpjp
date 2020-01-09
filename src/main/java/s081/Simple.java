package s081;

public class Simple {
	public int negate(int value) {// essendoci un certo spazio di memoria, rendere positivo il min value di un
									// intero non ci starebbe all'interno della memoria. es. lo short va da -128 a
									// 127, se io rendo positivo -128 va fuori.
		// è un unchecked perchè non è specificato il metodo throws
		if (value == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Can't negate MIN_VALUE");
		}
		return -value;
	}

	public int negate2(int value) throws MyNegateException {// è checked perchè enuncia l'eccezione fatta da noi sotto. 
		if (value == Integer.MIN_VALUE) {
			throw new MyNegateException(Integer.MAX_VALUE);
		}
		return -value;
	}

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("no value");
			return;
		}

		int value= 0;
		
		try{
			value = Integer.parseInt(args[0]);
		} catch(NumberFormatException nfe) {
			System.out.println("Pass me an integer");
			return;
		}
		
		Simple simple = new Simple();
		System.out.println("Negate " + value);

		try {
			int x = simple.negate2(value);
			System.out.println("My value negated is: " + x);
		} catch (MyNegateException mne) {
			System.out.println("My value negated is close to: " + mne.getAlternativeValue());
		}
	}
}

class MyNegateException extends Exception {
	private static final long serialVersionUID = 1L;
	private int alternativeValue;

	public MyNegateException(int alternativeValue) {
		this.alternativeValue = alternativeValue;
	}

	public int getAlternativeValue() { //metodo get: ha lo scopo di rendere disponibile una proprietà che è privata. in questo caso è l'unico modo per leggerlo, e nessuno lo modifica più
		return alternativeValue;
	}
}
