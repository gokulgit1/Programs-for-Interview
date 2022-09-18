package Practice;

public class Find2ndMaxi 
{
	public static void main(String[] args) 
	{
		int a[] = {2,6,9,1,7,5};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])  //descending
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}	
		}
		System.out.println(a[1]);  //get 2nd maximum
	}
}
