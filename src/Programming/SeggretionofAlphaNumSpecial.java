package Programming;



public class SeggretionofAlphaNumSpecial
{
	public static void main(String[] args)
	{
		String s="b@2xAB3y&";
		String al="";
		String num="";
		String sp="";
		for(int i=0; i<s.length();i++)
		{
           if(s.charAt(i)>=97 && s.charAt(i)<=122 ||s.charAt(i)>=65 && s.charAt(i)<=90)  //ASCII value
           {
        	   al=al+s.charAt(i);
           }
           else if(s.charAt(i)>=48 && s.charAt(i)<=57)
           {
        	   num=num+s.charAt(i);
           }
           else
           {
        	   sp=sp+s.charAt(i);
           }
		}
       System.out.println(al);
       System.out.println(num);
       System.out.println(sp);
	}
}
