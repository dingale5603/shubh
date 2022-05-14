package otherpackage;

public class Practice5 {
public static void main(String[] args) {
	int a[]= {0,1,2,3,5,7,6,8,9,66};
	
	for(int i=0;i<=a.length-1;i++) {
		int b=a[i]/2;
		if (a[i]==0||a[i]==1){
			System.out.println("not a prime no "+a[i]);
		}else if (a[i] % 2!=0 || a[i]==2) {
			System.out.println("prime no "+a[i]);
		}
		  
			  
		
	}
}
}
