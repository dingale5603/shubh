package control_stat;

public class For_loop {
	public static void l1() {
		for (int i=4; i>=0;i--) {
			System.out.println();
			for(int j=4;j>=i;j--) {
			System.out.print("*");
		}
			}
			}
	public static void l2() {
		for (int i=1; i<=4;i++) {
		System.out.println();
		for(int j=4;j>=i;j--) {
		System.out.print("*");
		}
		}
	}
	public static void l3() {
		for (int i=4; i>=0;i--) {
			System.out.println();{
			for(int j=4;j>=i;j--) 
				System.out.print(j);
			}
			}
	}
	public static void l4() {
	for (int i=1; i<=4;i++) {
		System.out.println();
		for(int j=4;j>=i;j--) {
		System.out.print(j);
	}
	}
		}
	public static void l5() {
		for (int i=4; i>=0;i--) {
			System.out.println();
			for(int j=4;j>=i;j--) {
			System.out.print("4");
		}
			}
	}
	public static void l6() {
		for (int i=1; i<=4;i++) {
			System.out.println();
			for(int j=4;j>=i;j--) {
			System.out.print("4");
	}
	}
		}
	public static void l7() {
		for (int i=4;i>=1;i--) {
			System.out.println();
			for(int j=4;j>=i;j--) {
				System.out.print(i);
			}
		}
	}
	
	public static void l8() {
		for (int i=1;i<=4;i++) {
			System.out.println();
			for(int j=4;j>=i;j--) {
				System.out.print(i);
			}
		}
	}
public static void main(String[] args) {
	l1();
	l2();
	System.out.println();
	l3();
	l4();
	System.out.println();
	l5();
	l6();
	System.out.println();
	l7();
	l8();
}
}
