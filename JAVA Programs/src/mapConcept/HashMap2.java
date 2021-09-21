package mapConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap<Integer,Employee>  emp=new HashMap<Integer,Employee>(); 
		Employee e1=new Employee("Sachin",21,"FIS");
		 
		Employee e2=new Employee("Bhuppi",22,"Cogni");
		 
		Employee e3=new Employee("Ankit",23,"PO");
		 
		Employee e4=new Employee("Aboli",24,"CS");
		
		emp.put(1,e1);
		emp.put(2,e2);
		emp.put(3,e3);
		emp.put(4,e4);
		
		// to traverse
		
		for(Entry<Integer,Employee> m: emp.entrySet())
		{
			int k=m.getKey();
		Employee e=m.getValue();
		System.out.println(k+"Info");
		System.out.println(e.name+e.age+e.dept);
		
		}
		
		
	
	}

}
