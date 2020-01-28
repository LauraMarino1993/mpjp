package ex;

import java.util.ArrayList;
import java.util.Scanner;

//ho un array list vuoto in cui devo inserire input da tastiera, tranne se scrivo exit, in quel caso finisco.
public class Exscan {

	 public static void main(String[] args) {
		 ArrayList<String> al = new ArrayList <>(); 
		 
		 Scanner scanner=new Scanner(System.in);
		 
			 while(scanner.hasNext()) { //looppo sullo scanner: finchè scrivo roba sulla tastiera...
				 
				String s=scanner.next();//ritorna la stringa corrente che l'utente mi ha messo dentro
				if (s.equals ("exit")) { //se scrivo exit mi fermo
					break;
				}
				
				al.add(s);//il metodo add mi consente di aggiungere la stringa all'array list
			 }  {
			
			 }
		 
		 scanner.close();
		 System.out.println(al);
	 }
	
}
