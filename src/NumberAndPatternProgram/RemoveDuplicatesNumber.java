package NumberAndPatternProgram;

public class RemoveDuplicatesNumber 
{
	public static void main(String[] args) 
	{
		int n[] = {10,2,10,6,7};
		for(int i=0;i<n.length;i++)
		{   
			int count =0;
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
              {
            	count++;  
              }
			}
			if(count==0)
			System.out.print(n[i]+" ");
		}
	}
}
