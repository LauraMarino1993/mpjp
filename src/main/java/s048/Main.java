package s048;

public class Main {
   public static void main(String[] args) {
	   Dog[] dogs = new Dog [10]; //creiamo un array di 10 cani
			   
			   
	   for (int i=0; i<dogs.length; i++) { //voglio fare il loop 10 volte. in questo caso la i non è legata a un array, ma rappresenta un contatore.
       dogs[i]  = new Dog();
	
		 	}
	   
	   dogs[5].bark(); //chiamo il metodo dogs per far abbaiare il cane in posizione 5
	
} 
}
