package block;
        //execution of block, methods, constructor 
public class Block_explain {
   static int p;
	static int q;

	// static method
	public static void s1() {
		System.out.println("static method"); // static method
	}
	// non static method
	public void s2() {
		System.out.println("non static method"); // non static method
	}

	// constructor
	Block_explain() {
		p = 63; // constructor
	}
     
	// non static block
	{
		System.out.println("non static block"); // non static block
		q = 53;
		System.out.println(q);
	}
	
	// static block
	static {
		System.out.println("static block"); // static block
		q = 56;
		p = 63;
		int res = p + q;
		System.out.println(res);
	}

	public static void main(String[] args) {
		s1();
		System.out.println(p);
		Block_explain a = new Block_explain();
		a.s2();

	}
}
