package accessmodifier;
// return type explanation
public class Returntype {
	public static String s1() { // string 's' should be capital and in that declaration line we used return type
								// string having method name s1
		String a = "deepak";
		return a;
	}
	public static int p1(int a, int b) { // in that declaration line we used return type integer having method name p1
	   return a + b;
	}
	public static float r1(float a, float b) { // in that declaration line we used return type float having method name r1
	   return a / b;
	}
	public static char u1() { // in that declaration line we used return type character having method name u1
		char a = 's';
		return a;
	}
   //square of number
	void square(int num) {
		int res= num * num;
		System.out.println("square value: "+res);
	}
	//area of circle
	public void areaOfCircle(float a) { 
		float res =3.14f * a * a;
		 		System.out.println("area of circle "+res);
	}
                      //parameterization concept
	public float areaOfCircle1(float a) {      //here in signature we use float so  
		return 3.14f * a * a;                  //if we have to change value of radius we can change directly from main method
	}                                          //we don't need to see program

	public static void main(String[] args) {
		Returntype sq = new Returntype();
		sq.square(19) ;
		String str = s1();
		System.out.println("my name is " + str);
		System.out.println("static addition = " + p1(55, 66));
		System.out.println("static float division = " + r1(3.9f, 35));
		System.out.println(u1());
		Returntype k = new Returntype();
		k.areaOfCircle(5);
		System.out.println(k.areaOfCircle1(13));
		
	}
}
