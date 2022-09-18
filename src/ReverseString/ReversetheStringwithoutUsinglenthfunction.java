package ReverseString;

//reverse the given string without using length function and length variable

public class ReversetheStringwithoutUsinglenthfunction 
{
	public static void main(String[] args)
	{
		String s="sivakasi";

		String rev="";
		int count=s.compareTo(rev);

		for(int i=count-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		
		//2nd way
		
		String rev1="";
		char[] str = s.toCharArray();
		
		for (char i : str) 
		{
			rev1=i+rev1;
		}
		System.out.println(rev1);
	}


}
