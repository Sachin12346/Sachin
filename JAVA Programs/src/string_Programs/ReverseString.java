package string_Programs;

public class ReverseString {
	public static void main(String[] args) {
		
		String str="Bhuppi";
		int len=str.length();
		
		System.out.println("*****USing String Buffer");
		System.out.println("length of the string is:"+len);
		StringBuffer buff=new StringBuffer(str);
		buff.reverse();
		System.out.println(buff);
		
		System.out.println("*****USing toCharArray()");
		String str1="Bisht";
		char rev[]=str1.toCharArray();
		int len2=rev.length;
		System.out.println(len2);
		for(int j=len2-1;j>=0;j--)
			System.out.print(rev[j]);
		
		
		
		System.out.println("*****USing another character array");
		
		String str3="Sachin";
	char[] reverse=new char[str.length()];
	for(int k=(str3.length()-1),l=0;k>=0;k--,l++)
			{
		reverse[l]=str3.charAt(k);
		
			}
	
	System.out.println(reverse);
	
	
	System.out.println("********by using rev timepass,string concatenation concept");
	
	String ss="Ankit";
	String re="";
	for (int x=(ss.length()-1);x>=0;x--)
	{
		re=re+ss.charAt(x);
	}
	System.out.println(re);
		
	}

}
