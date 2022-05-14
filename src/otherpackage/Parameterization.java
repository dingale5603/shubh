package otherpackage;

public class Parameterization {
public static void m1(int a, String d, int b) {
	int res =a+b;
	System.out.println(res);
	System.out.println(d);
	
}


int x;
int y;
String name;
Parameterization(){
	name="deepak";
	x=35;
	y=95;
}

Parameterization(int k, int l,String m){
	x=k;
	y=l;
	name=m;	
}
Parameterization(int p, String r,int q){
	x=p;
	y=q;
	name=r;
}

public static void main(String[] args) {
	m1(9,"deepak",56);System.out.println("------------------------------");
	
	Parameterization f= new Parameterization();
	System.out.println(f.name);
	System.out.println(f.x);
	System.out.println(f.y);
	Parameterization g= new Parameterization (199,"deepak",133);
	System.out.println(g.name);
	System.out.println(g.x);
	System.out.println(g.y);
	Parameterization h=new Parameterization (95,"amol",566);
    System.out.println(h.name);
	System.out.println(h.x);
	System.out.println(h.y);
}








}

