package setConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass1 {

	public static void main(String[] args) {
		
		
		//Set s=new LinkedHashSet(); // follow the insertion order the way u input

		//Set s=new HashSet(); // dont follow the insertion order

		Set s=new TreeSet(); // it doesnt follow the insertion order but it does the sorting  
		
		s.add("apple");
		s.add("mango");
		s.add("banana");
		s.add("grapes");
		s.add("orange");
		s.add("apple");
		
		System.out.println(s);	
	if(s.contains("banana"))  // to chcek the thge given element is present or not
	{
		System.out.println("Yes it contains banana");
		
	}
	else 
	{
		System.out.println("No it doesnt conatian banana");
	}
	
	
	if(s.isEmpty()) // to chcek the set is empty or net
		System.out.println("set is empty here");
		else 
			System.out.println("set is not empty");
	s.clear(); // to wipe out
	if(s.isEmpty())
		System.out.println("set is empty here");
		else 
			System.out.println("set is not empty");
	}
	
	}


