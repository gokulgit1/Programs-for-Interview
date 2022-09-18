package OccuranceWord;

import java.util.LinkedHashSet;

public class PrintonlyDuplicateWord 
{
	public static void main(String[] args)
	{
		String s="Welcome to Tyss Welcome";

		String[] str = s.split(" ");

		//step 1:remove duplicates-create any set collection and add each word of given string to set

		LinkedHashSet<String> set=new LinkedHashSet<String>();  //it will maintaining insertion order also


		for (int i = 0; i < str.length; i++)
		{
			set.add(str[i]); 
		}

		//step 2:compare each word of set with all char of given string (we get count of each char)
		for(String word:set)
		{
			int count=0;
			for (int i = 0; i < str.length; i++) 
			{
				if(word.equals(str[i])) //here compare each word of set
				{
					//step 3:if word are matching ,increment count
					count++;
				}
			}

			//step 4:print the current word along with count
			if(count>1)                              
				System.out.println(word+" "+count); 

			//System.out.print(word+""+count);  
		}
	}
}
