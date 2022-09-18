package Programming;

public class StringPattern 
{
	public static void main(String[] args) 
	{
		String s="welcome";
		String result="";
		for(int i=0;i<s.length();i++)
		{
			result=result+s.charAt(i);
			System.out.println(result);
		}
	}
}
