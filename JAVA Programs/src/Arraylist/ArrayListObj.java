package Arraylist;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListObj {

	public static void main(String args[])
	{
		
		Employee e1=new Employee("sachin",27,"FIS");
		Employee e2=new Employee("ankit",25,"PO");
		Employee e3=new Employee("Bhuppi",28,"Cogni");

		ArrayList<Employee> ale= new ArrayList<Employee>();  // arrayList of the object type.
		ale.add(e1);
		ale.add(e2);
		ale.add(e3);
System.out.println("hello");
	
for(int i=0;i<(ale.size());i++)
{
	Employee emp=ale.get(i);
	System.out.println(emp.name);
	System.out.println(emp.age);
	System.out.println(emp.dept);
}
	
Iterator<Employee> itr=ale.iterator();  // Iterator is a interface  and ietrator() is a method 

while(itr.hasNext())   // itr.hasNext :- check the presence if yes return true
{
	Employee emp=itr.next();  //itr.next :- gives the elemnet at the current index and move the pointor to the next index
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
}
	
	}
}
