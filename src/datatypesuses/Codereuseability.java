package datatypesuses;

public class Codereuseability {
	public static void additionsubtraction () {
	int a=35;
	int b=63;
	int result=a+b;
	int result1=a-b;
	System.out.println("output addition = "+result);
	System.out.println("output subtraction = "+result1);
	}
	public static void multiplication (){
		int a=6;
		int b=3;
		int result=a*b;
		System.out.println("output multiplication = "+result);
		
	}
	public void dividation() {
		float a=169;
		int b=5;
		float result=a/b;
		System.out.println("output dividation = "+result);
	}
	public static void main(String[] args) {
		Codereuseability.multiplication();
		Codereuseability.additionsubtraction();
		Codereuseability p=new Codereuseability();
		p.dividation();
		System.out.println("all result are obtain");
		Codereuseability v= new Codereuseability();
		v.reka();
	}
	public void reka() {
		int a=2;float  b=25; float result=a/b;
		System.out.println("non static output division = "+result);
	}
}
