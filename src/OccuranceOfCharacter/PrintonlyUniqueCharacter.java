package OccuranceOfCharacter;

import java.util.LinkedHashSet;

//Print only unique characters in the given string

public class PrintonlyUniqueCharacter
{
	public static void main(String[] args) 
	{
		String s="india";
		
		//step 1:remove duplicates-create any set collection and add each chararcter of given string to set
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();  //it will maintaining insersion order also
		//HashSet<Character> set=new HashSet<Character>();
		
		for (int i = 0; i < s.length(); i++)
		{
			set.add(s.charAt(i));  //i n d i a
		}
		
		//step 2:compare each character of set with all char of given string (we get count of each char)
		for(Character ch:set)
		{
			int count=0;
			for (int i = 0; i < s.length(); i++) 
			{
				if(ch==s.charAt(i)) //here compare each character of set
				{
					//step 3:if char are matching ,increment count
					count++;
				}
			}
			
			//step 4:print the current char along with count
			if(count==1)              //print only unique character
			System.out.println(ch+" "+count); 
			
			//System.out.print(ch+""+count);  //i2n1d1a1
		}
	}
}
