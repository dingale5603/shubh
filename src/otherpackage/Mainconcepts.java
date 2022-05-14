// concept of non static method explain here
//non static method call static variable and static method without creating instance
//static method allways need body that point consider from interface point of view
package otherpackage;

public class Mainconcepts {
		static int a=1;
	 	
	 
	public static void a1() {
		 int b=4;
		 int c=a+b;
		 System.out.println(c);
	}
	
	public void a3() {
		Mainconcepts.a1();
	}
	Mainconcepts(){
		
	}
	
	public static void main(String[] args) {
		Mainconcepts e=new Mainconcepts();
		e.a3();
	}
	

}
