package otherpackage;
//prime no 
public class Practice6 {
		public static void main(String[] args) {	
	int a=56;
	boolean prime =true;
	for (int i=2;i<a;i++) {
		if(a %i ==0) {
			prime=false;
			break;
		} 
		if(prime=false) {
		System.out.println(prime+" prime no" );
	}else  {
		System.out.println("not prime no"+prime);
	}
		}
}
}
