package localglobal_variable;

public class Local_global_Explain {
	static int a = 9; // static global variable
	int b = 6; // non static global variable b

	public static void j1(int b) { // local variable b
		int res = a + b;
		System.out.println(res);
	}

	public void j2(int c, int b) { // local variable
		int d = a + b + c;
		System.out.println(this.b);
		System.out.println(d);
	}

	public static void main(String[] args) {

		j1(5);
		 Local_global_Explain r = new Local_global_Explain();
		r.j2(6, 3);
		System.out.println(Local_global_Explain.a); // here i called simply static global variable value
		System .out.println(r.b); // here i called simply non static global variable

	}

}
