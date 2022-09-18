package Programming;

//print all possible substring of the given string 

public class AllPossibleSubString 
{
	public static void main(String[] args) 
	{
		String s="welcome";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
              System.out.println(s.substring(i, j));             
			}
		}
		
		/*String s="welcome";
		for(int i=0;i<s.length();i++)
		{
			String res=""+s.charAt(i);
			for(int j=i+1;j<=s.length();j++)
			{
				res=res+s.charAt(j);
				System.out.println(res);
			}
		}*/
		
	}
}
