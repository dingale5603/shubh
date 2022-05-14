package otherpackage;

import java.util.Arrays;

//largest no from array

public class LargestNo_Array {
	public static void main(String[] args) {
		int arry[]= {3,36,3456,1,65,364,36};
		
	for (int i=0;i<arry.length;i++) {
		System.out.print(" "+arry[i]);
		
	} 
		System.out.println();
		Arrays.sort(arry);
	    System.out.print("largest no in array "+arry[arry.length-1]);
		System.out.println();
		System.out.println("smallest no from array :"+arry[0]);
		
		//from that we can found 2nd 3rd largest and smallest
		
		
		
		
		 
		
		
		
		
	//2.one way of programming
	/*	int b=arry[0];
 		for(int i=0;i<=arry.length-1;i++) {
	
			if(b<arry[i]) {
				b=arry[i];
			}
		}
		System.out.println("largest no in array: "+b);*/
	
	
	}
}
