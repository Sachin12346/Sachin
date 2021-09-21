package abstractionInterfacePrograms;

public abstract class Figure {
	int  dim1;
	int dim2;
	
	Figure(int a,int b)
	{
	dim1=a;
	dim2=b;
	}
	abstract int area(); 
}
