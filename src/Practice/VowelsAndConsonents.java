package Practice;

public class VowelsAndConsonents
{
	public static void main(String[] args)
	{
      String s="Gokul"; 
      String s1=s.toLowerCase();
      int vcount=0;
      int ccount=0;
      for(int i=0;i<s1.length();i++)
      {
    	  char ch = s1.charAt(i);
    	  if(ch =='a'|| ch=='e'||ch=='i'|| ch=='o'|| ch=='u')
    	  {
    		 vcount++;
    	  }
    	  else
    	  {
    		  ccount++;
    	  }
      }
      System.out.println(vcount);    //  vowels count
      System.out.println(ccount);    //  consonant count 
	}
}
