package s076;

public class Main {
	public static void main(String[] args) {
		Dog tom = new Dog("Tom");

		String name = tom.getName();
		double speed = tom.getSpeed();

		System.out.println("Name and speed: " + name + ", " + speed);
		System.out.println("Color:" + tom.getColor());

		tom.setColor("yellow");// ho preso un reference a un dog, ma posso chiamare il metodo definito su pet
								// (il colore);perchè il metodo set color fa parte di pet, ma stiamolavorando su
								// tom che è un dog. possiamo chiamare il metodo perchè è pubblico.
		System.out.println("Color:" + tom.getColor());
	}
}
