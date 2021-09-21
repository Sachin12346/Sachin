package Arraylist;

import java.util.ArrayList;

public class ArraylistClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al1=new ArrayList();
		al1.add(5);
		al1.add(6);
		al1.add(7);
		al1.add(8);
		System.out.println(al1);
			al1.clear();
			System.out.println(al1.size());
			System.out.println(al1);
	}

}
