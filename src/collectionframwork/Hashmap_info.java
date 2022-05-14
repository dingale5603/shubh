package collectionframwork;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap_info {public static void main(String[] args) {
	

HashMap<String ,Integer> values=new HashMap<String ,Integer>();
values.put("deepak",837995270);
values.put("sumit", 899664663);
values.put("kiran",937995270);
values.put("ram", 399664663);
values.put("seeta",437995270);
values.put("guru", 894664663);
values.put("vasu",637995270);
values.put("raman", 396664663);



Set<String> allkeys = values.keySet();// to get all keys set
for(String a:allkeys) {               // to iterate each key
	System.out.println(a+":"+values.get(a));
}

System.out.println(allkeys);//to get all keys 

Set<Entry<String, Integer>> allentrys = values.entrySet(); // to get all entrys (key value pair)

for (Entry<String, Integer> oneattime : allentrys) {    //to iterate each entry
	System.out.println(oneattime.getKey()+":"+oneattime.getValue());
}




System.out.println(allentrys);
System.out.println(values.get(allkeys));
}



}
