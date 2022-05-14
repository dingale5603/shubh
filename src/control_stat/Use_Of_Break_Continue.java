package control_stat;

public class Use_Of_Break_Continue {
	
	          // use of break keyword and output
	public static void t1() {
		for (int i = 0; i <= 5; i++) {
			if (i == 3 || i == 4) {
				break;
			}
			System.out.println("i=" + i);
		}
	}
	         //use of continue keyword and output
	public static void t2() {
		for (int i = 0; i <= 5; i++) {
			if (i == 3 || i == 4) {
				continue;
			}
			System.out.println("i=" + i);
		}
	}
	
	public static void main(String[] args) {
		t1();
		System.out.println();
		t2();
	}
}