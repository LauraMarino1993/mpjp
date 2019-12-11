package s046;

public class Simple {
    static String h() { //definisco questo metodo h: è un metodo statico e ricorre a una stringa. h è un metodo,contiene degli statement. 
        return "Hi";
    }

    int f(int a, int b) {
        return a * b;
    }

    void g(boolean flag) { // richiamo g passando il parametro flag che è un booleano
        if (flag) { //se flag è true
            System.out.println("Hello");
            return; // termina l'esecuzione del metodo g. non ritorna niente perchè il metodo è void
        }

        System.out.println("Goodbye"); 
        return; //nel caso flag non sia true
    }
}