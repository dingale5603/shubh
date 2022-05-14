package string;
//reverse string 
public class Revesestr {
	
	public static void main(String[] args) {
		
	
	String a="deepak ingale";
	System.out.println(a);
	String b[]=a.split("");
    
  for(int i=b.length-1;i>=0;i--) {

		System.out.print(b[i]);
	}
  /*StringBuffer string= new StringBuffer("deepak");
 System.out.println(string.reverse());
 string.append("ingale");
 System.out.println(string);
 */
}}
