package mapConcept;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class HashMapProgram1 {

	public static void main(String[] args) {
	HashMap<Integer,String>  h=new HashMap(); // it doesnt follow the insertion order 
	//contains unique element//
	// contains value in key value pair
	// we may hav one null key and multiple null value
	//it maintains no order and there is no index
		// hashmap is a nonsynchronised: not thread safe
	// means multiple thread can attack and concurrent modification exception may come as one changes and other acces and get diffrnt value 
	// also knows as fail fast condition
	
	
	h.put(1,"apple");// for inserting
		h.put(2,"mango");
		h.put(3,"banana");
		h.put(4,"grapes");
		h.put(5,"orange");
		h.put(6,"apple");
		h.put(null, "value");//  no null pointer exception if we try to give one null key
		
		h.put(null, "dbdjd");// only 1 nullkey is allowed
		h.put(7,null);
		h.put(8,null);
		
		System.out.println(h);
		System.out.println(h.get(10)); // get(key)
		//h.clear();  // to get remove all
		System.out.println(h);
System.out.println(h.keySet());  // to get key set 
System.out.println(h.values()); // to get key set  valuyes
System.out.println("******Travesing in haspmap******");
		
for(Entry<Integer,String> m: h.entrySet())
{
	System.out.println(m.getKey()+"   "+m.getValue());// to get key and to get value
}

System.out.println("******Removing******");

h.remove(6);
for(Entry<Integer,String> m: h.entrySet())// to traverse hashmap
{
	System.out.println(m.getKey()+"   "+m.getValue());// to get key and to get value
}
	}

}
