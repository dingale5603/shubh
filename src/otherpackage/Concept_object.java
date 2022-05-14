package otherpackage;

public class Concept_object {
int a=36;
public void t1() { 
	 int b=36;a++;b++;
	System.out.println(a+ " " +b);
	
}
public static void main(String[] args) {
	Concept_object r =new Concept_object();
r.t1();
r.t1();

}
}
