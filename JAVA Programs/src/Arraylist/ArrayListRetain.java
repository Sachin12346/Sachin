package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRetain {

	public static void main(String[] args) {
		// retainAll : it makes only common elements in both 

		ArrayList al1=new ArrayList();
		ArrayList al2=new ArrayList();
		al1.add(1);
		al1.add(2);
		al1.add(5);
		
		al2.add(4);
		al2.add(2);
		al2.add(5);

	System.out.println(al1.size());
	al1.retainAll(al2);// shows commont element
	System.out.println(al1.size());
Iterator itr=al1.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	
	}

}
