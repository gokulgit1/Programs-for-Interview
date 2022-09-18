package ReverseString;

////reverse the given String without using Third variable

public class ReversetheStringwithoutusingThirdvariable
{
public static void main(String[] args) 
{
	String s="india";
	//        01234
	
	
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.print(s.charAt(i));
	}
	
}
}
