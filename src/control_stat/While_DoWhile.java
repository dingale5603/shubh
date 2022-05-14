package control_stat;
                           //simple while loop
public class While_DoWhile {
	static int a=15;
	public static void m1() {
		int a=1356;
		int length=0;
		while (a!=0){
			a=a/10; 
			//a is divide 10 upto while remender is 0
			length ++;     //after each division of 10 length incremented
			System.out.println(a);
		}
	System.out.println(length);
} 
	
	                      //simple do while loop
	public static void m2() {
		do{
			System.out.println(a);
			a--;
		}while(a>=9);	
	}
	
	
	
		public static void main(String[] args) {
			System.out.println();
			System.out.println("---output of while loop----");
			System.out.println();
		m1();
		    System.out.println();
		    System.out.println("---output of do while loop----");
		    System.out.println();
		m2();
	}
}