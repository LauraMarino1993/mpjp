package s076;

public class Pet {
	private static final String DEFAULT_COLOR = "white";
	private static final String DEFAULT_NAME = "My pet";
	
	private String name;
	private String color;

	public Pet() {
		this(DEFAULT_NAME);
	}
	
	public Pet(String name) {
		this(name, DEFAULT_COLOR);
	}

	public String getColor() {// getter=per fare in modo che chi usa la mia classe pet abbia accesso a una
								// certa proprietà. chiamo il metodo getColor e mi ritorna il colore
		return color;
	}

	public void setColor(String color) {// setter= se voglio che qualcuno possa modificare il colore
		this.color = color;
	}

	public Pet(String name, String color) {
		this.name = name;
		this.color = color;

	}

	public String getName() {
		return name;
	}
}