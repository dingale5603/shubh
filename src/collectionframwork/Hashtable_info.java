package collectionframwork;

import java.util.Hashtable;
import java.util.TreeMap;

public class Hashtable_info {
	public static void main(String[] args) {
		Hashtable<String, Integer> hash=new Hashtable<>();
		hash.put("deep", 100);
		hash.put("ram", 200);
		hash.put("shubh", 300);
		hash.put("manu", 400);
		hash.put("deepu", 500);
		hash.put("manoj", 350);
		
		
		System.out.println(hash.get("deep"));
		System.out.println(hash.get("manu"));
		System.out.println(hash.containsValue(100));
		System.out.println(hash);
		
		System.out.println(hash.hashCode());
		
		TreeMap <String, Integer>map=new TreeMap<>();
		map.isEmpty();
		map.put("rekha", 600);
		map.put("kumar", 400);
		System.out.println(map.lastKey());
		System.out.println(map.isEmpty());
		
		
		String name ="deepak";
		String name1="deepak";
		System.out.println(name);
		
		
		
		
	}

}
