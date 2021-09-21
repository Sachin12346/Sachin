package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListPrg1 {

	public static void main(String[] args) {
	LinkedList ll=new LinkedList();
		ll.add(5);  // adding value
		ll.add(6);
		ll.add(7);
		ll.add(8);
		
		System.out.println(ll.size()); // //find size
		System.out.println(ll);
		ll.set(1, "Bhuppi"); // overwrite theelement at the given index
		System.out.println(ll.size());
		System.out.println(ll);
ll.addFirst("firstElement"); // add at the first index
		System.out.println(ll.size());
	System.out.println(ll);
	ll.addLast("LastElement");  // add at the first index
	System.out.println(ll.size());
System.out.println(ll);

ll.set(0, "Overwrite first");  // overwrite the elemenrt at given index
System.out.println(ll);
ll.removeFirst();  // remove at the first index
System.out.println(ll);
ll.removeLast(); // remove at the first index
System.out.println(ll);
ll.remove(1);  // // add at the given  index
System.out.println(ll);

}
}