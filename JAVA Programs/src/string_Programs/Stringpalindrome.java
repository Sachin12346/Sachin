package string_Programs;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		System.out.println("enter the string u want to check for plaindrome  :");	
		Scanner sc=new Scanner(System.in);
		String ss=sc.next();
		
	//	String ss="arora";
		String re="";
		for (int x=(ss.length()-1);x>=0;x--)
		{
			re=re+ss.charAt(x);
		}
		System.out.println(re);
			
		if(ss.equals(re))
			System.out.println("*****palindrome");
		else
			System.out.println("****not*palindrome");
		
	}

}
