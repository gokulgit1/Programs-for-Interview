package Programming;

public class MatchingTheWordInGivenString
{
	public static void main(String[] args) 
	{
		String s="javaseleniumjavajavapython";
		String s1="java";
		int count=0;
		for(int i=0; i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				String res=s.substring(i, j);
			
				if(s1.equals(res))
				{
					count++;
				}
			}
		}
		System.out.println(s1+" "+count);
		
	}
}


/*Returns a string that is a substring of this string. 
 * The substring begins at the specified beginIndex and extends to the character at index endIndex 
 *  1.Thus the length of the substring is endIndex-beginIndex. 

Examples: 

 "hamburger".substring(4, 8) returns "urge"
 "smiles".substring(1, 5) returns "mile" */
 
