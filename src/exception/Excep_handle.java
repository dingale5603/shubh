package exception;

public class Excep_handle {
public static void main(String[] args) {
	int a[]= {56,36,38};
	System.out.println("before try block");
	try {
	System.out.println(a[3]);
	}
	catch(ArrayIndexOutOfBoundsException p) {
		System.out.println("Array  IndexOut Of Bounds Exception");
	}
    catch(ArithmeticException p) {
			System.out.println("Arithimatic Exception");	
	}catch(Exception p) {
		System.out.println("Generic Exception");
	}
	System.out.println("afer catch block");
	
	System.out.println();
	System.out.println("---------2nd try,catch block--------");
	int b=1;
	int c=0;
	System.out.println("before try block");
	try {
		int d=(b/c);
		System.out.println(d);
	}
	catch(ArithmeticException e) {
		System.out.println("my exception");
	}
	
	
	
	
	catch(ArrayIndexOutOfBoundsException p) {
		System.out.println("Array  IndexOut Of Bounds Exception");
	}
   // catch(ArithmeticException p) {
		//	System.out.println("Arithimatic Exception");	
	//}
     catch(Exception p) {
		System.out.println("Generic Exception");
	}
	System.out.println("afer catch block");
	
	

}
}