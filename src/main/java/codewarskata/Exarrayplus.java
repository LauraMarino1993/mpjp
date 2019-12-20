package codewarskata;

//sommare i valori di due array
public class Exarrayplus {
	public static int arrayPlusArray(int[] arr1, int[] arr2) {
	    int sum1=0;
	    for (int i=0; i<arr1.length;i++) {
	    	sum1+=arr1[i];
	    }

	    int sum2=0;
	    for (int i=0; i<arr2.length; i++) {
	    	sum2+=arr2[i];
	    }
	  
	    int sum=sum1+sum2;	    
	    return sum;
	}
}

// con il for each: 
//int sum = 0; 
//for (int cur:arr1) {
//	sum +=cur
//}
//for (int cur:arr2) {
//	sum+=cur}
//return sum