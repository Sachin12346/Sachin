package Arraylist;

import java.util.ArrayList;

public class ArrayListSet {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(5);
		al1.add(6);
		al1.add(7);
		al1.add(8);
		
		System.out.println(al1.size());
		al1.set(1, "Bhuppi"); // overwrite theelement at the given index
		System.out.println(al1.size());
		System.out.print(al1);

	}

}
