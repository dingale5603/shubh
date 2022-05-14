package operater;

public class Alloperater {
	static int a=100;
	static int b=30;
	public static void a1 () {     System.out.println("---------------------Arithmetic opration-------------------------");
		System.out.println("add: "+(a+b));
		System.out.println("sub: "+(a-b));
		System.out.println("mul: "+(a*b));
		System.out.println("div: "+(a/b));
		System.out.println("percen: "+(a%b));
		}
	public static void a2() {      System.out.println("---------lesstan equal to operation -------------");
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		}
	public static void a3() {    System.out.println("--------------unary opeartion -------------------");
		System.out.println(a+=10);
		System.out.println(b-=50);
	}
	public static void a4() {System.out.println("------------incre   decre  operation --------------");
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(--b);
		System.out.println(b--);
				
	System.out.println((a++)+(b++)+(a--)+(b--));
	}
public static void main(String[] args) {
	a1();
	a2();
	a3();
	a4();
	
}
}