package collectionframwork;

import java.util.LinkedList;

public class Linkedlist1 {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("abc");
		ll.add(13);
		ll.add("a");
		ll.add(6);
		ll.add(null);
		ll.add("abc");
		ll.add(13);
		ll.add("a");
		ll.add(6);
		ll.add(null);
		ll.add(6);
		
	System.out.println(ll);
	System.out.println(ll.size());
	System.out.println(ll.contains(6));
    System.out.println(ll.getFirst());
   System.out.println(ll.getLast());
   ll.remove(1);
    System.out.println(ll);

		
		
}
}
