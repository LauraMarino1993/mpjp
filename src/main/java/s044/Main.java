package s044;

public class Main {
	public static void main(String[] args) { // args è un array vuoto

		System.out.println(args.length);

		for (String arg : args) { //vedendo che args è di lunghezza 0, non mi tira fuori nulla e passa all'istruzione successiva. 
			System.out.println(arg);
		}

		for (int i = 0; i < args.length; i++) {//la variabile sarà sempre di tipo int perchè è l'indice, non importano le tipologie         valori contenuti nell'array. 
			System.out.println(args[i]);
		}

		int i = 0;
		while (i < args.length) { //visto che i è zero, non è minore di zero e non entra nel loop. e anche sopra uguale.
			System.out.print(args[i]);
			i += 1;
		}

	}
}