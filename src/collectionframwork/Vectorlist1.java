package collectionframwork;

import java.util.Vector;

public class Vectorlist1 {
public static void main(String[] args) {
	Vector list= new Vector();
	list.add("abc");
	list.add(13);
	list.add("a");
	list.add(6);
	list.add(null);
	list.add("abc");
	list.add(13);
	list.add("a");
	list.add(6);
	list.add(null);
	list.add(6);
	
	
	System.out.println(list);
	System.out.println(list.size());//11
	System.out.println(list.capacity());//20 because increment capacity*2.5 
System.out.println(list.elementAt(3));//6
list.remove(6);
System.out.println(list);//13 remove which present at6
System.out.println(list.firstElement());
System.out.println(list.lastElement());
System.out.println(list.indexOf("a"));
System.out.println(list.get(1));
}

}
