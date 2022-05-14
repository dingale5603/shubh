package basicjava;

public class Demo1 {
	public  void a1(int a,int b) {
		int c=a+b;
		System.out.println(c);
		
	}
	public static void a3(int a,int b) {
	int s=a+b;
	System.out.println(s);
	}
	public static void main(String[] args) {
		
		Demo1 a=new Demo1();
		a.a1(1, 3);
		a.a1(1, 4);
		Demo1.a3(5, 6);
		
	}

}
