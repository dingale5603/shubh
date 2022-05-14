package collectionframwork;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistexplain {
	public static void main(String[] args) throws InterruptedException {
		ArrayList list=new ArrayList();
		list.add("deepak ingale");
		list.add("automation engineer");
		list.add(2017);
		list.add("zentech solution");
		list.add("deepak ingale");
		
		System.out.println("is collection empty= "+list.isEmpty());//false
		System.out.println("print size of collection= "+list.size());  //5
		System.out.println("print element in list of collection= "+list);//[deepak ingale, automation engineer, 2017, zentech solution, deepak ingale]
		System.out.println("2017 index no= "+list.indexOf(2017));//2
		System.out.println("findout last index element= "+list.lastIndexOf("deepak ingale"));//4
		System.out.println("get 3rd index element= "+list.get(3));//zentech solution
		System.out.println("is my collection contains automation element= "+list.contains("automation"));//false
		list.add(3, "blood group b+");
		System.out.println("after adding element i have to see whichelement i have added in my collection= "+list.get(3));//blood group b+
		System.out.println("after adding size of collection= "+list.size());
		System.out.println(list.set(0, "deepak"));//0th index vaule set as deepak
		System.out.println("print list of collection after set deepak at 0th index= "+list);
		Iterator a = list.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
			Thread.sleep(1000);
		}
		System.out.println(list.remove(5));//remove 5th index element
		System.out.println(list);
		
		
	}

}
