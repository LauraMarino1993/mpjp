package s050;

public class AboutStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(20);// posso passare un numero, è un modo di pre-allocare spazio all'interno del mio string builder.
        StringBuilder sb3 = new StringBuilder("hello");
        
        System.out.println("capacity 1: " + sb.capacity());
        System.out.println("capacity 2: " + sb2.capacity());
        System.out.println("capacity 3: " + sb3.capacity()); // quanto spazio ho allocato per lo string builder
        
        System.out.println("appending: " + sb3.append(' ').append("world")); // è come la concatenazione ma lavora sulla string builder corrente invece di crearne uno nuovo.
        
        System.out.println("char at position 1 in sb3 is '" + sb3.charAt(1) + "'");
        
        System.out.println("deleting: " + sb3.delete(5, 10).deleteCharAt(2)); // elimina tutti i caratteri tra 5 e 10 (10 escluso) e poi elimina il carattere nella posizione 2
        
        System.out.println("index of \"elo\": " + sb3.indexOf("elo"));
        
        System.out.println("inserting \"lo c\" at 3: " + sb3.insert(3, "lo c")); // mi permette di inserire nuovi caratteri a partire da una certa posizione
        
        System.out.println("current sb3 length: " + sb3.length());
        
        System.out.println("replace section 2-7 with \"r r\": " + sb3.replace(2, 7, "r r")); // prendi l'intervallo da 2 a 7 (escluso) e inseriscimi una stringa che ti passo. può essere una stringa di dimensione completamente diversa
        
        System.out.println("reversing: " + sb3.reverse()); // ribalta i caratteri
        
        sb3.setCharAt(5, 'a'); // vai in carattere in posizione 5 e mettici dentro una a
        System.out.println("setCharAt: " + sb3);
        
        sb3.setLength(3);
        System.out.println("setLength: " + sb3); // riduco la lunghezza, tutto il resto viene buttato via.
    }
}
