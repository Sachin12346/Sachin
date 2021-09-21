package wrapperClasses;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		String str=Integer.toString(x);
		System.out.println(str);
		
		String num="13456";
		int number=Integer.parseInt(num);
		System.out.println(number);
		
		
		 System.out.println(Character.toLowerCase('c'));
	      System.out.println(Character.toLowerCase('C'));
		
	      System.out.println(Character.toUpperCase('x'));
	      System.out.println(Character.isUpperCase('x'));

	      System.out.println("******white spaces");
	      System.out.println(Character.isWhitespace('c'));
	      System.out.println(Character.isWhitespace(' '));
	      System.out.println(Character.isWhitespace('\n'));
	      System.out.println(Character.isWhitespace('\t'));
	}

}
