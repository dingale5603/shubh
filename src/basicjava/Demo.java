package basicjava;

public class Demo {
	
    int a = 10;

	public static void m1() {
		int a=63;
		System.out.println(a);
	}

	public static void m2() {
		int a=6;
	System.out.println(a);}
	
	public void m3() {
		System.out.println(a);
	}
		
	public static void main(String[] args) {
		m1();
		m2();
		Demo f=new Demo();
		f.m3();
		// 3.usage:
		System.out.println("name");
		System.out.println("grade");
		System.out.println("rollno");
		System.out.println("percentage");

	}
}
