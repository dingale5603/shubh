//abstract class concept
//in abstract class by default abstract method are public and final but not static by default  
//in abstract class we use constructor
package otherpackage;

abstract public class Abstractconcept {
	static int s=4;
	public static void a1() {
		int d=1;
		int n=s+d;
		System.out.println(n);
}
	abstract public  void a();
	Abstractconcept(){
		
	}
	
	public static void main(String[] args) {
		Abstractconcept.a1();
		
	}
}