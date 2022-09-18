package OccuranceOfCharacter;

import java.util.LinkedHashSet;

public class RemoveOnlyDuplicates
{
	public static void main(String[] args) 
	{
		String s="indiaan";    ///output = inda
		
		//step 1:remove duplicates-create any set collection and add each chararcter of given string to set
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();  //it will maintaining insersion order also
		
		
		for (int i = 0; i < s.length(); i++)
		{
	        set.add(s.charAt(i));  
		}
		
		
		for(Character ch:set)
		{
			System.out.println(ch);   //print in next line 
			
			//System.out.print(ch);   //print in same line
		}
	}
}
