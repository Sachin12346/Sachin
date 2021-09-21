import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
System.out.print("Enter the number for which u need to check whether it is plaindrome or not  :");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int temp=x;
		int rev=0;
		while(temp>0)
		{
			rev =(rev*10)+temp%10;
			
			temp=temp/10;
			
		}

		System.out.println("the reverse of the number  is "+rev);
		
if(rev==x)
System.out.println("number is palindrome");
else
	System.out.println("number is not palindrome");		
}
}

