package s077;

public class Main {
    public static void main(String[] args) {
//		Cat cat = (Cat) new Dog();

        Pet pet = new Dog("Bob");//creo un nuovo dog e lo metto in un reference a pet. posso farlo perchè pet è una superclass: upcasting

        // risky
        Dog dog = (Dog) pet;//faccio una copia del reference dog che era in pet. stesso oggetto, diversa reference
        dog.bark();//visto che dog è un reference a Dog posso chiamare il metodo bark che è in dog, ma non in pet.

//        // next line leads to a ClassCastException
//        Cat cat = (Cat) pet;//in riga 10 ho definito pet come cane, non posso cambiarlo e mettere il reference a Cat
//        // next line is just not to have a warning for unused cat on the previous line
//        System.out.println(System.identityHashCode(cat));

        if (pet instanceof Cat) {//se pet è un gatto allora fallo miagolare
            Cat tom = (Cat) pet; 
            tom.meow();
        } else {
            System.out.println("This pet is not a cat!");
        }
        if (pet instanceof Dog) {//se pet è un gatto allora fallo miagolare
            Dog tom = (Dog) pet; 
            tom.bark();
        } 
    }
    
}
