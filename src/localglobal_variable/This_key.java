package localglobal_variable;
                            //this keyword use explain
    public class This_key {
	      static int a=6;
	int b=9;
                             // this keyword applicable for only non static method and in same class

	public void t(int b) {
		int c=a+b;
		System.out.println(a); //here we called static global variable and print it
		System.out.println(b);
		System.out.println(this.b);      //here we used this keyword to call non static global variable b
		System.out.println(c);            //here we print value of c
		
	}
	public static void t1() {
		System.out.println(a);  //here we only call static global variable because non static global variable not call in static method
			
	
	}
public static void main(String[] args) {
	This_key r=new This_key();
	r.t(56);
	This_key.t1();
}
}
