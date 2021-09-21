package string_Programs;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="1234";
		String s2="1234";
		String s3=new String("1234");
	System.out.println(s1==s2);
	System.out.println(s2==s3);
	System.out.println(s2.equals(s3));
	System.out.println(s3.equals(s1));
	}
	

}
