package NumberAndPatternProgram;

import java.util.Scanner;

public class AmstrongNumber 
{
	public static void main(String[] args) 
	{
      System.out.println("Enter the Number");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp=n;
      int sum=0;
      while(n!=0)
      {
    	 int d=n%10;
    	 sum=sum+d;
    	 n=n/10;
      }
      if(sum==temp)
    	  System.out.println(temp+ " is Amstrong Number");
      else
    	  System.out.println(temp+ " is not a Amstrong");
	}
}
