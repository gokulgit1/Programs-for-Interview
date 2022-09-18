package ReverseString;

//reverse the given string by using Third variable

public class ReversetheStringbyUsingThirdVariable 
{
public static void main(String[] args) {
	
	String s ="Tamilnadu";
	
	String rev="";        //empty string
	
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
		
	}
	System.out.println(rev);
	
}
}
