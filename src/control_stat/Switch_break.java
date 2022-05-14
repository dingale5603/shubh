package control_stat;

public class Switch_break {
	static int a=1;
	public static void r1() {
	switch(a=3) {
	case 1:  System.out.println("deepak ");  
	break;
	case 2:  System.out.println("subham");
	break;
	case 3:  System.out.println("akshay");
	break;
	case 4:  System.out.println("pratik");
	break;
	default: System.out.println("not print ");
	}
	}
	public static void main(String[] args) {
		r1();
	}
}
