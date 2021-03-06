package s046;

public class MethodCaller {
    public static void main(String[] args) {
        System.out.println(Simple.h()); //simple.h: stiamo invocando il metodo h della classe Simple. posso fare così solo perchè h è un metodo statico. Non ho bisogno di un oggetto per chiamarlo.
        
        Simple reference = new Simple(); //istanzia un oggetto di tipo Simple, alloca nello stack spazio per una variabile di tipo reference e ci mette il reference dell'oggetto simple.in questo caso è un oggetto così semplice che non contiene dei veri dati
        
        
        int result = reference.f(7, 6);
        System.out.println(result);
        
        reference.g(true); // metodi d'istanza. una volta che ho un oggetto (reference) posso chiamare il metodo. sto chiamando il metodo g passandogli true perchè in Simple g è un booleano. reference è una variabile definita in riga 7.
        reference.g(false);
    }
}
