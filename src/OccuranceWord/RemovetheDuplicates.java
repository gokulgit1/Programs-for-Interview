package OccuranceWord;

import java.util.LinkedHashSet;

public class RemovetheDuplicates
{
	public static void main(String[] args) 
	{
		String s="Welcome to Tyss Welcome to gc11";

		String[] str = s.split(" ");

		//step 1:remove duplicates-create any set collection and add each word of given string to set

		LinkedHashSet<String> set=new LinkedHashSet<String>();  //it will maintaining insertion order also
		

		for (int i = 0; i < str.length; i++)
		{
			set.add(str[i]);  
		}
		
		for (String word : set) 
		{
		 System.out.print(word+" ");	
		}
	}
}
