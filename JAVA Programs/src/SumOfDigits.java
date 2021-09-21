import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
System.out.print("Enter the number for which u need the sum of its digits   :");
		
		Scanner sc=new Scanner(System.in);
	
		int x=sc.nextInt();
		int sum=0;
		while(x>0)
		{
			sum=sum+(x%10);
			x=x/10;
			
		}

		System.out.println("the sum of the digits is "+sum);
		System.out.println("hello github");
		
	
	}

	}

