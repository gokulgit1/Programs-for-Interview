package Practice;

import java.util.LinkedHashSet;

public class PositionOfEachCharacter
{
	public static void main(String[] args)
	{
		String s = "Tesing";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		/*for(int i=0;i<s.length();i++)                  //forward
		{
			set.add(s.charAt(i));
		}*/
		
		for(int i=s.length()-1;i>=0;i--)                 //reverse  
		{
			set.add(s.charAt(i));
		}

		for(Character ch:set)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				if(ch==s.charAt(i))
				{
                   System.out.println(ch+" "+(i+1));
                   break;
				}
			}
		}
	}
}
