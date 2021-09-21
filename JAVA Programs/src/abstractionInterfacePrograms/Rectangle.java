package abstractionInterfacePrograms;

public class Rectangle extends Figure
{

	Rectangle(int  a, int b)
	{
		super(a, b);
	}
	// override area for rectangle
	int  area()
	{
	System.out.println("Inside Area for Rectangle.");
	return dim1 * dim2;
	}
}
