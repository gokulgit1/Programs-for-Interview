package ReverseNum;

//Palindrome Number

public class ReverseTheNumber    
{
	public static void main(String[] args) 
	{
		int n=121;
		int temp=n;
		int rev=0;
		while(n>0)
		{
			int reminder=n%10;
			rev=rev*10+reminder;
			n=n/10;
		}
		if(rev==temp)
		{
			System.out.println(temp+" "+" is a Palindrome");
		}
		else
		{
			System.out.println(temp+" "+" is not a palindrome");
		}
	}
}
