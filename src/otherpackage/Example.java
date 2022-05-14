package otherpackage;

public class Example {
public static void main(String[] args) {
	
	String a ="idea";                    //memory not allocated separately
	String b ="idea";
	System.out.println(a==b);

	String c="idea";
	String d=new String("idea");         //memory allocated separately
	System.out.println(c==d);
	
	String e=new String("idea");
	String f=new String("idea");      //memory allocated separately 
	System.out.println(e==f);

}
}
