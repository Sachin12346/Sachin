package mapConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableprg {
	public static void main(String[] args)
	{
		// hasmap is non synchronised but hashtable is synchronised i.e thread safe means .at a time only one
		// key value
		// key----> object ----> HashCode--->value;
		// key is stored in the form of object
		//and each object has hascode(unique number provided by jvm: 32 )
		// not null key not null value
		
		
		
		Hashtable<Integer,String> h= new Hashtable<Integer,String>();
		h.put(1,"Aboli");
		h.put(2,"Bhuppi");
		h.put(3,"sachin");
	//	h.put(null, "value");// null pointer exception if we try to give null key;; 
	//h.put(4, null);// null pointer exception if we try to give null value;; 
		System.out.println(h);
		
		// cloninng the object;
		Hashtable<Integer,String> h2= new Hashtable<Integer,String>();
		h2=(Hashtable)h.clone();// typecast
		System.out.println(h2);
		System.out.println(h.hashCode());// to get hashcode
		System.out.println(h2.hashCode());
		h.clear();
		System.out.println(h);
		System.out.println(h2);// h2 has value 
		
		if(h2.containsValue("ccc"))
			System.out.println("Yes it conatin value");
		else 
			System.out.println("no it doesnt  conatin value");
		
		
		// travesring in hashtable using enumeration;
		Enumeration<String> e=h2.elements();//  .elements method return enumeration
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		System.out.println("travesring in hashtable using entrySet");
		// travesring in hashtable using entrySet();
		
		for(Entry<Integer,String> m:h2.entrySet())
			System.out.println(m.getValue());
		
		
	}

}
