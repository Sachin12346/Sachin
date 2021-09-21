package Arraylist;

import java.util.ArrayList;

public class ArrayListPrg2 {

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
		
		System.out.println(al1);
		System.out.println(al2);
		al1.add(al2); // add() add the complete object of that Collection as a single unit
		
		System.out.println(al1);
		al1.addAll(al2);// addAll() add all the elements of that collectionl;
		System.out.println(al1);
		
		
		System.out.print(al1.get(4)); // al1.get(index )  returns value of that index
		
		
		
	}

}
