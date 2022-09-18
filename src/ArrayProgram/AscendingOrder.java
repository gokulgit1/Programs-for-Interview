package ArrayProgram;

//Sort all the elements in ascending order and get first minimum number

public class AscendingOrder 
{
	public static void main(String[] args)
	{
		int a[] = {20,10,30,50,40};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];    //swapping
					a[i]=a[j];
					a[j]=temp;
				}
			}
			//System.out.print(a[i]+" ");
		}
		////get first minimum number = first we need to do Ascending order
		System.out.println(a[0]);    //1st minimum number
		System.out.println(a[1]);   //2nd minimum number
		
		System.out.println(a[a.length-1]);  //get the last value
	}
	
}
