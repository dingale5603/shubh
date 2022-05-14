package metodes_types;

public class Explain {// Non static method
    public void test() {
		System.out.println("This is non-static method");
	}

	//Static method
   protected static void test1() {
		System.out.println("This is static method");
	}

	public static void main(String[] args) {
		Explain deepak = new Explain();   //object creation
		deepak.test();                     //Non Static method call
		test1();                           //Static method call
	}

}
