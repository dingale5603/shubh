package constructor;

public class Test {
	String name;  int a; int b;
	    // non parameterized constructor
	 Test (){   
		name ="deepak";
		a=63;
	}
       // parameterized constructor
	Test (String s, int x, int y){
        a=x;
        b=y;
        name=s;
        
	} 
	Test (int y, String s, int x){
		 name=s;
		 a=y;
		 b=x;
		} 
	
	public static void main(String[] args) {
		Test e=new Test();
		System.out.println(e.name);
		System.out.println(e.a);
		System.out.println("------------------------------------");
		Test t=new Test("deepak",56,63);
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.name);
		System.out.println("-------------------------------------");
		Test n=new Test("shubham",356,200);
		System.out.println(n.a);
		System.out.println(n.b);
		System.out.println(n.name);
	}
}
