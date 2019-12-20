//package codewarskata;
//
//public class Exisitanumber {
//	public boolean isDigit(String s)
//	  {
//	      //esaminare il contenuto di una stringa return true se è un numero intero o floating point or false se ci sono spazi in mezzo, più di un punto o altri caratteri
//		
//		 
//		boolean started=false;//vuol dire che il numero non è ancora cominciato. serve per aggirare gli spazi bianchi che magari sono all'inizio della stringa
//		boolean minus=false
//		boolean dot=false; //devo vedere se c'è un punto, accetto solo un punto e non di più
//		 
//		 for (int i=0; i<s.length; i++) {//faccio un loop per vedere tutti i caratteri della stringa
//			char cur=s.charAt(i);//prendo il carattere corrente della stringa
//			
//			
//			if (Character.isDigit(cur)) {
//				started=true;
//			} else if (cur=='.') {
//				if (dot == true) { //se c'è già stato un punto prima
//					return false;
//				 }
//				}
//			}
//			 
//		 }
//
//}}

