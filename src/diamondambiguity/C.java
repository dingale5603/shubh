package diamondambiguity;

public class C  implements A {
	public void t1(){
		System.out.println(A.a);
	}
	
	public static void main(String[] args) {
		C c=new C();
		c.t1();
		
	}
}
