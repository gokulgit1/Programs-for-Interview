package StringProgram;

public class SpiltAndCombindString 
{
	public static void main(String[] args)
	{
       String s= "aabb";      //abab
       
       int n=s.length()/2;
       System.out.println(n); //2
       
       for(int i=0;i<n;i++)
       {
    	   System.out.print(s.charAt(i)+""+s.charAt(n+i));
    	 
       }
	}
}
