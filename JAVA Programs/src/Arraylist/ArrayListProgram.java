package Arraylist;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList();
		al.add(0);// add the element to current collection on the last
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(1, 10);// add the element to index given 
		al.add(70);
		System.out.println(al.size());
		System.out.println(al);
		int a=al.get(7);
		System.out.println(a);

		
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
	}

}
