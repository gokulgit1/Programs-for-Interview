package ArrayProgram;

public class AdditionOfTwoArray 
{
	public static void main(String[] args)
	{
		int a[] = {1,2,3};
		int b[] = {4,5,66};
       
		for(int i=0;i<b.length;i++)            // here we can use a.length or b.length bcoz both are same in length
		{
          System.out.print(a[i]+b[i]+" ");
		}

	}
}
