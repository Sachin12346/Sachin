package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class TraversinginList {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList();
		ll.add(5);  // 
		ll.add(6);
		ll.add(7);
		ll.add(8);
		
		System.out.println("for loop");
		for(int i=0;i<ll.size();i++)
		System.out.println(ll.get(i));
		
		
		System.out.println("Iterator");
		Iterator it=ll.iterator();
	
		while(it.hasNext())
System.out.println(it.next());
		

		System.out.println("advance for loop");
		for (int a: ll)
System.out.println(a);
	}

}
