package metodes_types;

public class Explain2 {
	public static void D1() {                           // static method1 declaration
		System.out.println("static 1");              
	}
	public static void D2() {                          // static method2 declaration
	System.out.println("static 2");
	}
	public static void D3() {                             // static method3 declaration
		System.out.println("static 3");
		
	}
	public void S1() {                                    // non static method1 declaration    
		System.out.println("nonstatic 1");
	}
	public void S2() {                                     // non static method2 declaration
		System.out.println("nonstatic 2");
	}
	public void S3() {                                      // non static method3 declaration
		System.out.println("nonstatic 3");
	}
	public static void main(String[] args) {
		Explain.test1();                                      //here i called static method from previous class (Explain.java)
		Explain pre=new Explain();                       //here i called non static method from previous class (Explain.java)
		pre.test();
		Explain2.D1();
		Explain2.D2();D2();
		Explain2.D3();D3();
		Explain2 r= new Explain2();
		r.S1();r.S1();
		r.S2();
		Explain2 k= new Explain2();
		k.S3();
	}

}
