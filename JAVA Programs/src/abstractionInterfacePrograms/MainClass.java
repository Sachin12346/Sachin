package abstractionInterfacePrograms;

public class MainClass {

	public static void main(String[] args) {
Rectangle r= new Rectangle(10,30);
Triangle t= new Triangle(20,20);
Figure f=r;
System.out.println(f.area());
System.out.println(f.dim1+""+f.dim2);
 f=t;
System.out.println(f.area());
System.out.println(f.dim1+""+f.dim2);
	}

}
