package StringProgram;



public class VowlesConsonentsStringArray 
{
	public static void main(String[] args)
	{
		String str[] = {"apple","mango","banana","orange"};
		for(int i=0;i<str.length;i++)
		{	
			System.out.println(str[i]+" "+countVowels(str[i]));
		}
	}
	public static int countVowels(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{	
			char ch=s.charAt(i);
			if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' || ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
			{
				count++;
			}
		}
		return count;
	}
}	
