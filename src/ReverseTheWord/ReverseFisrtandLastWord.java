package ReverseTheWord;

//Reverse the 1st and last word along with reverse the character also

// String s="welcome to tyss bangalore";
// String s="bangalore to tyss welcome";

public class ReverseFisrtandLastWord 
{
	public static void main(String[] args)
	{
		String s="welcome to tyss bangalore";
		String[] str=s.split(" ");

		for (int i = 0; i <s.length(); i++) 
		{
			String s1=str[i];
			if(i==0 || i==(str.length-1))
			{
				for (int j = s1.length()-1; j >=0;j--) 
				{
					System.out.print(s1.charAt(j));	
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(s1+" ");
			}
		}
	}
}
