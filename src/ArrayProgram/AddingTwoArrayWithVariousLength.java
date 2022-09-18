package ArrayProgram;

public class AddingTwoArrayWithVariousLength
{
	public static void main(String[] args)
	{
		int a[] = {1,2,3,8};
		int b[] = {4,9,6,4,10};

		int count=a.length;
		if(a.length<b.length)
		{
			count=b.length;
		}
		for(int i=0;i<count;i++)
		{
			try 
			{
				System.out.print(a[i]+b[i]+" ");
			}
			catch(Exception e)
			{
				try
				{
					System.out.println(b[i]+" ");
				}
				catch(ArrayIndexOutOfBoundsException c)
				{
					System.out.println(a[i]+" ");
				}
			}
		}
	}
}
