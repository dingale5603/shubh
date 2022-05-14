package array;

public class Ary_fun {
	public static void main(String[] args) {
	String ary="deepak ingale";
	String d[]= ary.split(" ");
	System.out.println(d[0].length());
	System.out.println(d[1].length());
	System.out.println(d.length);
	
	System.out.println("---------swap name------");
	String o="deepak ingale";
	String str[]=o.split(" ");
	System.out.println(str.length);
	System.out.println(str[0]+" "+str[1]);
	System.out.println(str[1]+" "+str[0]);

	System.out.println("----reverse sentence------");
	String p="my name is deepak";
	System.out.println(p.length());
	String rest[]=p.split("");
	System.out.println(rest.length);
	for(int i=0;i<=rest.length-1;i++) { 
		System.out.print(" "); 
		System.out.print(rest[i]);
	}
	System.out.println();
		for(int j=rest.length-1;j>=0;j--) {
			System.out.print(" ");
			System.out.print(rest[j]);
		}
		
		System.out.println();
		System.out.println("----split accountno and int value-------");

		String s="Accountno: 113544161541541";
		String u[]=s.split(" ");
	System.out.println(u[0]);
	System.out.println(u[1]);
	
		
	}

}
