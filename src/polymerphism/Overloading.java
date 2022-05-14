package polymerphism;

public class Overloading {
		public void t1(int a) {
			System.out.println(a);
		}
		public void t1(int a,int b) {
			int c=a+b;
			System.out.println(c);
		}
		public void t1 (int a ,int b, int c ) {
			int d=a+b+c;
			System.out.println(d);
		}
		public static void main(String[] args) {
			Overloading a=new Overloading();
			a.t1(5,6,8);
}
		}