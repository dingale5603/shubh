package array;
import java.util.*;
public class Str {
	public static void main(String[] args) {
		String array[]=new String[3];
		array[0]="deepak";
		array[1]="amol";
		array[2]="rupa";
	System.out.println(array[1]);
		
		String a[]= {"deep","sepa"};
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		
		Arrays.sort(array);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[0]);
		
		
		//String (new memory not allocated) name1 also pointing towards same value
		String name ="deepak";
		String name1="deepak";
		System.out.println(name);
		
	//	multi dimentional array
		
		int w[][]= {{13,36,35},{46,35,39}};//2 by 3 array 
	System.out.println(w[1][1]);
	
	int sq[][]=new int[2][3];     //another way representation of array
	sq[0][0]=55;
	sq[0][1]=56;
	sq[0][2]=57;
	sq[1][0]=58;
	sq[1][1]=59;
	sq[1][2]=60;
	System.out.println(sq[1][2]);
	System.out.println(sq[0][2]);
	
	}
	

}
