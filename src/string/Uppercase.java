package string;
// String first latter convert into upper case
public class Uppercase {
	public static void main(String[] args) {
		
	String a="my name is deepak ingale";
	
	String b[]=a.split(" ");
	System.out.println(a);
	for(int i=0; i<=b.length-1;i++) {
	   String x = b[i].substring(0,1);
	 
	  System.out.print(x.toUpperCase()+b[i].substring(1)+" ");
	   
		
	}
	//System.out.println(a.toUpperCase());
}
}

