package Arraylist;

import java.util.ArrayList;

public class Arraylistremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al1=new ArrayList();
		al1.add(5);
		al1.add(6);
		al1.add(7);
		al1.add(8);
		ArrayList al2=new ArrayList();
		al2.add(9);
		al2.add(10);
		al2.add(11);
		al2.add(12);
		
		al1.add(al2);
		System.out.println(al1.size());
		System.out.println(al1);
			
			al1.remove(al2);// remove  al2 as a single unit
		System.out.println(al1.size());
		System.out.println(al1);
		System.out.println(al1.size());
			System.out.println(al1);
			
		al2.add(9);
		al2.add(10);
		al2.add(11);
		al2.add(12);
		al1.addAll(al2);
		System.out.println(al1.size());
		System.out.println(al1);
		al1.removeAll(al2); // remove all the element of the al2
		System.out.println(al1.size());
		System.out.println(al1);  
	}

}
