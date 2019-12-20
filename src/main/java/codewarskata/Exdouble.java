package codewarskata;

public class Exdouble {
	 public static int[] map(int[] arr) {
         int[] duplicated = new int[arr.length];   
		 for (int i=0; i<arr.length;i++) {
             duplicated[i] = arr[i]*2; 	
            }
		 return duplicated;
	  }

}
