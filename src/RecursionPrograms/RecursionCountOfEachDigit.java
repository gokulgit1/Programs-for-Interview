package RecursionPrograms;

public class RecursionCountOfEachDigit 
{
	static int n=12345;
	static int sum=0;
	public static void main(String[] args) 
	{
      System.out.println("start");
      printName();
      System.out.println(sum);
      System.out.println("end");      
	}
	public static void printName()
	{
		if(n>0)
		{
			int rem=n%10;
			sum =sum+rem;
			n=n/10;
			printName();
		}
	}
}
