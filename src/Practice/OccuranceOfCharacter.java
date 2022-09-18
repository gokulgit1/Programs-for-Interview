package Practice;

import java.util.LinkedHashSet;

public class OccuranceOfCharacter 
{
	public static void main(String[] args)
	{
		String s="Gokulakannan";
		
		LinkedHashSet<Character> set =new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}

		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			//if(count==1)    //print unique value
			//if(count>1)     // print only duplicates
			System.out.println(ch+" "+count);

		}
	}
}
