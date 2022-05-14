package otherpackage;

import java.util.Arrays;

//sort array ascending or descending order
public class Array_asce_desc {
	public static void main(String[] args) {
		int a[]= {65,13,56,64,89,64,54633};
				Arrays.sort(a);
				for(int i=0;i<=a.length-1;i++) {
					System.out.print(" "+ a[i]); //ascending order
				}
				System.out.println();
				for(int i=a.length-1;i>=0;i--) {
					System.out.print(" "+ a[i]); //descending order
				}
	
		}

}
