package NumberAndPatternProgram;

import java.util.Scanner;

public class TablesCount 
{
	public static void main(String[] args) 
	{
      System.out.println("Enter the number");
      Scanner sc= new java.util.Scanner(System.in);
      int num =sc.nextInt();
      for(int i=1;i<=10;i++)
      {
    	  System.out.println(num*i);
      }
	}
}
