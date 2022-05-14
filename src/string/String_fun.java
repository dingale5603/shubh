package string;

public class String_fun {
	public static void main(String[] args) {
		
	
	//String a="pavan";
	//String a1="deepak";
	//String b="dipak";
	//String c=new String ("deepak");

//System.out.println(a.isEmpty());//false
//System.out.println(b.equals(a));//false
//System.out.println(a1.compareToIgnoreCase(b));
//System.out.println(a==a1);//false
//System.out.println(a1==c);//true
//System.out.println(a.equals(a1));
//System.out.println(a1.equals(b));
//System.out.println(a.equalsIgnoreCase(c));
//System.out.println(a.toLowerCase());
//System.out.println(a1.toUpperCase());
//System.out.println(b.toUpperCase());
//System.out.println(b.charAt(3));
//System.out.println(a.endsWith(a1));
StringBuilder s=new StringBuilder("tony kakar");
//s.append(" ");
//s.append("m");// append m into present string
//s.append("k");//append k into present string
System.out.println(s);
s.insert(1, "k");//insert k at 1st index
System.out.println(s);
s.delete(7, 'a'); //after index all char are deleted
System.out.println(s);
s.setCharAt(0,'p'); // set char at 0 index by p
System.out.println(s);
s.deleteCharAt(0);// only char at 0 delete
System.out.println(s);
s.reverse();
System.out.println(s);

//difference between  string and string builder

String e="deep";
String w="ak";
System.out.println(e+w);

StringBuilder j=new StringBuilder("my name deepak");
System.out.println(j);
j.append(" and i have completed be");
System.out.println(j);
j.setCharAt(0, 'd');
System.out.println(j);




String d[]= {"deepak ingale"};
for(int i=d.length-1;i>=0;i--) {
	
	System.out.print(d[i]);
}




	}
}