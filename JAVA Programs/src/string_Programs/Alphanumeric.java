package string_Programs;

public class Alphanumeric {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Bhuppi123$94894");
		StringBuffer alphabhaiya=new StringBuffer();
		StringBuffer numberbhaiya=new StringBuffer();
		StringBuffer specialbhaiya=new StringBuffer();
		int len=str.length();
		
	
		  System.out.println("*****USing String Buffer");
		System.out.println("length of the string is:"+len);
		//StringBuffer buff=new StringBuffer(str);
		for(int i=0;i<len;i++)
		{
		if(Character.isAlphabetic(str.charAt(i)))
				{
			
			//OR 	System.out.println(str.charAt(i));
	
			alphabhaiya.append(str.charAt(i));
				}
		else if(Character.isDigit(str.charAt(i)))
		{

	numberbhaiya.append(str.charAt(i));
		}
		else{
			

	specialbhaiya.append(str.charAt(i));
		}
			

		}
		System.out.println("Bhaiyoo bheno alphabets are "+alphabhaiya);
		System.out.println("Bhaiyoo bheno alphabets are "+numberbhaiya);
		System.out.println("Bhaiyoo bheno alphabets are "+specialbhaiya);
	}

}
