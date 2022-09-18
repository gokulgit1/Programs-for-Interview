package Programming;

public class PrintOccuranceOfCharacter
{
	public static void main(String[] args) 
	{
		String s="a2b3c4";
		//        012345
		for(int i=0;i<s.length();)
		{  // i=0 0<5  ,i=2 i=4 6>5...
			int n=s.charAt(i+1)-48; //50-48=2 ASCII value used here
			while(n>0)
			{  //2>0 1>0 0>0 ,,,3>0 2>0 1>0 0>0,,,,4>0 3>0 2>0 1>0 0>0...
				System.out.print(s.charAt(i));  //aabbbcccc
				n--; //1 0 ,,,2 1 0,,,3 2 1 0
			}
			i=i+2; // 2, 4, 6 
		}
	}
}
