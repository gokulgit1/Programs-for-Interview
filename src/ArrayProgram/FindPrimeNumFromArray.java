package ArrayProgram;

//find the prime number in given array

public class FindPrimeNumFromArray 
{
	public static void main(String[] args) 
	{
		int a[]= {2,3,4,5,6,7,8,9};
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int j=2;

			while(n>0)
			{
				if(n%j==0)
				{
					break;
				}
				else
				{
					j++;
				}
			}
			if(n==j)
			{
              System.out.println(a[i]);
			}
		}
		
		System.out.println(10+20+"java");
		System.out.println("java"+10+20);
	}
}
