package s044;

public class Esercizio5 {
	
	public static void main (String [] args) {
		
		int[] array = { 5, 7, 1, 3, 4 }; 
		boolean seven = false;
		boolean one = false;
				
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
			one = true;
			System.out.println("there's a 1 in position " + i);
			}
			
		for (int j=0; j<array.length; j++)
			if (array[j]== 7) {
			seven = true;
			System.out.println ("there's a 7 in position "+j);
			}
			
			else {
//			presente = false; 
//			System.out.println ("there are not 1 or 7");
				}
	}

}
}
