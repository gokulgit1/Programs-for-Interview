package Programming;

//print the Position of Each Character present in Given String in reverse Order and insertion order also 2 for loop here used

import java.util.LinkedHashSet;

public class PositionOfEachCharacterinGivenString
{
	public static void main(String[] args) 
	{
		String s="Tester";
		//        123456
		       s=s.toLowerCase();
		       
		//step 1:remove duplicates-create any set collection and add each chararcter of given string to set

		LinkedHashSet<Character> set=new LinkedHashSet<Character>();  //it will maintaining insersion order also
		
		// this for loop for maintaining insertion order 
		
//		for (int i = 0;i<s.length(); i++)
//		{
//			set.add(s.charAt(i));  
//		}
		
       //this for loop for print reverse order
		
		for (int i = s.length()-1;i>=0; i--)
		{
			set.add(s.charAt(i));  
		}
		  
		
		//step 2:compare each character of set with all char of given string (we get count of each char)
		for(Character ch:set)
		{
		
			for (int i = s.length()-1;i>=0; i--) 
			{
				if(ch==s.charAt(i)) //here compare each character of set
				{
					//step 3:
                    System.out.println(ch+"="+(i+1));
                    break;
				}
			}
		}
	}
}