package s077;

public class Exercise {
	public static void main(String[] args) {
		// array di pet con un cane e un gatto

		Pet pet = new Dog("Pluto");
		Pet pet2 = new Cat("Milo");

		Pet[] array = { pet, pet2 };
		// for each sui pet

		for (Pet current : array) {
			if (current instanceof Dog) {
				Dog dog = (Dog) current;
				dog.bark();
			}
			else if (current instanceof Cat) {
				Cat cat = (Cat) current;
				cat.meow();
			} else {
				System.out.println("Unknown pet");

			}

		}

	}

	// abbaiare i cani, miagolare i gatti
}
