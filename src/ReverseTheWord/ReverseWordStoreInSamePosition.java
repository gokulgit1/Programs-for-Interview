package ReverseTheWord;

public class ReverseWordStoreInSamePosition
{
	public static void main(String[] args) 
	{
		String s="welcome to bangalore";
		String[] str=s.split(" ");
		for(String word:str)
		{
			for(int i=word.length()-1;i>=0;i--)
			{
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}
	}
}
