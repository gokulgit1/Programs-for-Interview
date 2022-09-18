package Programming;

//Print SubString with Length Of Two Character Without Duplicates 

import java.util.HashSet;
public class PrintSubStringwithLengthOfTwoCharacterWithoutDuplicates 
{
	public static void main(String[] args) 
	{
		String s="welcomecome";
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				String res=s.substring(i, j);
				if(res.length()==2)
				{
					set.add(res);
				}
			}
		}
		System.out.println(set);
	}
}
