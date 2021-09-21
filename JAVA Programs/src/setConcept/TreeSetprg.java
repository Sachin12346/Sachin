package setConcept;

import java.util.ArrayList;

import java.util.TreeSet;

public class TreeSetprg {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		a.add(23);
		a.add(43);
		a.add(13);
		a.add(23);// dublicate is allowed
		a.add(53);
		//a.add(null);// null is allowed
System.out.println(a);
TreeSet t=new TreeSet(a);// it will perform sorting, remove dublicate and remove null
t.addAll(a);// not taking dublicate
System.out.println(t);
	}

}
