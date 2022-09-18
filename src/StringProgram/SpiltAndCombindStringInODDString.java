package StringProgram;

public class SpiltAndCombindStringInODDString 
{
	public static void main(String[] args)
	{
		 String s= "abcxyzp";      //axbyczp
	       
	       int n=(s.length()-1)/2;
	       System.out.println(n);    // 3
	       
	       for(int i=0;i<n;i++)
	       {
	    	   System.out.print(s.charAt(i)+""+s.charAt(i+n)); 
	       }
	       System.out.println(s.charAt(s.length()-1));
	}
}
