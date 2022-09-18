package StringProgram;

// to check whether given character is vowels or consonents

import java.util.Scanner;

public class VowelsAndConsonents
{
	public static void main(String[] args)
	{
		System.out.println("Enter any character");
		Scanner sc=new Scanner(System.in);
		Character ch = sc.next().charAt(0);
		if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' || ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
		{
          System.out.println("entered character is vowels");
		}
		else
		{
			System.out.println("entered character is consonents");
		}
	}
}
