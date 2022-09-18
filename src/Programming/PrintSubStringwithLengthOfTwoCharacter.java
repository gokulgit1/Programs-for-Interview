package Programming;

public class PrintSubStringwithLengthOfTwoCharacter 
{
	public static void main(String[] args) 
	{
      String s="welcome";
      for(int i=0;i<s.length();i++)
      {
    	  for(int j=i+1;j<s.length();j++)
    	  {
    		  String res=s.substring(i, j);
    		  if(res.length()==2)
    		  {
    			  System.out.println(res);
    		  }
    	  }
      }
	}
}
