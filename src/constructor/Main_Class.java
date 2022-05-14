package constructor;

public class Main_Class {
	public static void main(String[] args) {
		Class2 q=new Class2();
		System.out.println(q.j);
		System.out.println(Class1.res); 
		
	    System.out.println("----------------------------");
		Class2 w=new Class2(63,"pqr");
		System.out.println(w.j);
		System.out.println(w.l);
		
		System.out.println("----------------------------");
		Class2 x=new Class2("abc",96,69);
		System.out.println(x.j);
		System.out.println(x.l);
	}

}
