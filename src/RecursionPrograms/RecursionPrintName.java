package RecursionPrograms;

// execute same name multiple times without using any looping statement we go for Recurssion

public class RecursionPrintName
{
	static int count=0;
	public static void main(String[] args) 
	{
       printName();   
	}
	public static void printName() 
	{
		if(count<5)
		{
		System.out.println("Gokul");
		count++;
		printName();
		}
	}
}
