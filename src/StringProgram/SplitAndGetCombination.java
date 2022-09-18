package StringProgram;

public class SplitAndGetCombination 
{
	public static void main(String[] args)
	{
		String s="abc";           
		
		s=s+"xyz";       //abcxyz  here count 3+3=6
		
		System.out.println(s);   //abcxyz  concat
		
		// output::axbycz 

		int n=s.length()/2;
		for(int i=0;i<n;i++)
		{
			System.out.print(s.charAt(i)+""+s.charAt(i+n));
		}

	}
}
