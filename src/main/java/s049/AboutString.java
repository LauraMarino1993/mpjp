package s049;

public class AboutString {
    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String u = "or";
        System.out.println("s, t, u: " + s + ", " + t + ", " + u);

        System.out.println("char at position 1 in s: " + s.charAt(1)); //è l'equivalente delle []dell'array, mi dice in che posizione c'è un determinato carattere. 

        System.out.println("s < t: " + s.compareTo(t)); //se la prima lettera di s viene prima in ordine alfabetico della prima lettera di t, allora è minore e avrà valore -1. se i caratteri sono gli stessi, passerà al successivo. es. hello - hella, è più piccolo hella: -1. se è hello ed hello: 0. 
        System.out.println("t > s: " + t.compareTo(s)); // risultato opposto. nella console c'è -15 e 15 perchè sono i caratteri di distanza tra h e w in ordine alfabetico

        System.out.println("concat s and t: " + s.concat(t)); //concatenazione, è come se fosse s+t

        System.out.println("t contains u? " + t.contains(u));// or ci deve essere nella stessa sequenza, non ci possono essere una r e una o sparse.

        String u2 = t.substring(1, 3);//substring, sottostringa: genera una nuova stringa, che comincia in posizione 1 di t (incluso) e finisce in posizione 3 (esclusa)
        System.out.println("u2 = t.substring(1, 3): " + u2);// u2 è or
        System.out.println("t.substring(3): " + t.substring(3));//specifica il begin in posizione 3 (compresa), a partire da 3 fino alla fine

        System.out.println("u equals u2? " + u.equals(u2));// sia u che u2 hanno or, guardiamo il contenuto
        System.out.println("u == u2? " + (u == u2));// u e u2 sono entrambi or, ma sono due oggetti diversi, confronto sui reference: false. come se fossero due omonimi

        System.out.println("First index of 'l' is s: " + s.indexOf('l')); //cerca la prima l che trova nella stringa
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l')); // cerca l'ultima l che trova nella stringa. se non c'è ritorna -1. 
        System.out.println("there is no 'x' in s: " + s.indexOf('x'));
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

        System.out.println("check if an empty string is empty: " + "".isEmpty());// quando una stringa c'è ma è vuota. 

        System.out.println("s length: " + s.length()); // metodo che negli array è invece una proprietà. stessa funzionalità, ma nelle stringhe è un metodo e ha bisogno della parentesi tonda

        String s2 = s.replace('l', 'q'); //sostituisco le l contenute nella stringa con q
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

        String[] splits = "one for me, one for you".split(" ");// definisco lo spazio bianco come separatore, genera un array di stringhe [] partendo dalla stringa e facendola a pezzi
        System.out.println("Splitting: "); 
        for (String token : splits) {
            System.out.println(token);
        }
        String joined = String.join(" ", splits); // lavoro opposto della split: gli passo un array di stringhe, uso come congiuntore in questo caso lo spazio bianco, e fai diventare tutto una stringa sola
        System.out.println("Joining back [" + joined + "]");

        System.out.println("upper: " + s.toUpperCase()); //trasforma tutta la stringa in caratteri caps lock
        System.out.println("lower: " + "SHUT UP!".toLowerCase());

        System.out.println("trim [" + " la la la ".trim() + "]"); // elimina gli spazi bianchi all'inizio e alla fine della mia stringa
        
        String x = null;
        System.out.println("Sort of safe toString(): " + String.valueOf(x)); //converte la x nella sua rappresentazione stringa. costruisco una stringa a partire da un oggetto qualunque. x deve essere un oggetto di tipo reference. 
        
    }
}
