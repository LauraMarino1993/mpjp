package s073;

public abstract class Mammal {
	protected int gestation; // proprietà gestazione

	public Mammal(int gestation) { // Mammal è un costruttore, stesso nome della classe con parametro gestation
		this.gestation = gestation;// this.gestation: la variabile gestation che appartiene alla classe corrente
									// Mammal. reference all'oggetto corrente, voglio mettere il valore che mi passa
									// l'utente nella proprietà gestation
	}

	@Override //toString è già stato definito nella classe madre di Mammal
	public String toString() {//to string è un metodo che mi riorna una nuova stringa
		return "Mammal [gestation=" + gestation + "]"; //riporta il nome del tipo e il tempo di gestazione
	}
}

// se non abbiamo specificato la classe madre di Mammal, quindi non c'è extend, allora la classe madre sarà Object