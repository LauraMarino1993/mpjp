package s073;

public class Cat extends Mammal { // la classe Cat estende la classe astratta Mammal, ma è una classe concreta
	private Tail tail;

	public Cat(int gestationDays, int tailLen) { // costruttore Cat, con all'interno 2 parametri
		super(gestationDays);// super classe: stiamo risalendo la gerarchia delle classi e andando a vedere
								// quella che sta sopra passandogli un parametro. in questo caso la classe che
								// sta sopra è Mammal
        this.tail = new Tail(tailLen);// this: la classe corrente
	}

	@Override
	public String toString() {//con il metodo toString si convertono gli oggetti in stringhe
		return "Cat [tail=" + tail + ", gestation=" + gestation + "]";
	}
}
