package abstractionInterfacePrograms;

public class Triangle extends Figure{

	
	Triangle(int a, int b)
	{
		super(a, b);
	}	
	//override area for right triangle
	int area()
	{
	System.out.println("Inside Area for Triangle.");
	return dim1 * dim2 / 2;
	}
}

