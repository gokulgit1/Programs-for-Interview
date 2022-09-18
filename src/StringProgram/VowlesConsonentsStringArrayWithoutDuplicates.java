package StringProgram;

import java.util.LinkedHashSet;

public class VowlesConsonentsStringArrayWithoutDuplicates 
{
	public static void main(String[] args) 
	{
		String [] str= {"applee","mangoo","banana","orangee"};
		
		for(int i=0;i<str.length;i++)
		{
			int count=0;
			 String m = str[i];
			LinkedHashSet<Character> set=new LinkedHashSet<Character>();
			for(int j=0;j<m.length();j++)
			{
				set.add(m.charAt(j));
			}
			for(Character ch:set)
			{
				if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' || ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
				  count++;
			}
			System.out.println(m+" ==> "+count);	
		}
	}
}
