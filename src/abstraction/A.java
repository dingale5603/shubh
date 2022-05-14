package abstraction;

abstract public class A

{
	 
 public void s1() {        //complete method
	 int a=0; 
	 System.out.println(a);
	 System.out.println("abstarct class");
         
 do {
	 a=a+125;
	 System.out.println(a);  
 } while (a<1250);
 } 
 
 abstract public void s2();   //incomplete method 
}
