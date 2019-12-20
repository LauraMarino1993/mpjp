package s075;
//ogni costruttore poodle è un modo diverso per creare un barboncino all'interno della classe

public class Poodle extends Dog {
	private static final int DEFAULT_DENSITY = 3;
	private int curlDensity;

	public Poodle() {
		super();// faccio riferimento alla superclasse dog perchè non è specificato nè nome nè
				// peso. ma devo creare comunque il cane se creo un barboncino
		this.curlDensity = DEFAULT_DENSITY;
	}

	public Poodle(String name) {
		super(name);// sto passando solo il nome del nuovo poodle alla classe dog, mentre il peso
					// sarà assegnato di default
	}

	public Poodle(String name, int weight) {
		this(name, weight, DEFAULT_DENSITY);
	}

	public Poodle(String name, int weight, int curlDensity) {// l'utente passa nome, peso e densità del pelo
		super(name, weight);// nome e peso sono passate al costruttore di cane
		this.curlDensity = curlDensity;// densità del pelo la definisco qui
	}

	@Override
	public String getName() {
		return "Poodle " + super.getName();//getname non esiste in object, ma in dog: polimorfismo tra cane e barboncino 
	}

	@Override
	public String toString() {
		return "Poodle " + super.toString() + " " + curlDensity; // voglio che la mia tostring mette le informazioni del
																	// poodle e anche quelle generiche di cane
	}
}
