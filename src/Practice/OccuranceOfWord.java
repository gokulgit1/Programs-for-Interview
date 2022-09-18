package Practice;

import java.util.LinkedHashSet;

public class OccuranceOfWord 
{
	public static void main(String[] args) 
	{
		String s = "Toady is Monday next day of monday is tuesday";

		String[] str = s.split(" ");

		LinkedHashSet<String> set = new LinkedHashSet<String>();

		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}

		for(String word:set)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i]))
				{
					count++;
				}
			}
			if(count>1)                             //print only duplicates
			System.out.println(word+" "+count);
		}
	}
}
