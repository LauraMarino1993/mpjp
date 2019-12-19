package codewarskata;

//esercizio: rimuovere gli spazi bianchi da una stringa

//opzione 1
//public class Exstring {
//
//	static String noSpace(final String x) {
//		return x.replace(" ", ""); // abbiamo creato una nuova stringa copia della precedente, dove abbiamo
//							// sostituito gli spazi bianchi con sotto-stringhe vuote
//	}
//	
//
//}

//opzione 2
public class Exstring {

	static String noSpace(final String x) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= sb.length(); i++) {
			char cur = x.charAt(i);
			if (cur != ' ') {
				sb.append(cur); // se i caratteri non sono uno spazio, aggiungo i caratteri allo stringbuilder e
								// lo assegno
			}
		}
		return sb.toString(); //trasformo in una stringa quello che ho ottenuto
	}

}
