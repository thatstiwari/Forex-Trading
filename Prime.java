import java.util.Scanner;
	
	public class Prime
{
	public static void main(String args[])

{
	int n1,i;
	Scanner n = new Scanner(System.in);
	System.out.println("Enter any number");
	n1 = n.nextInt();
	
	
	for( i=2;i<n1;i++)
	{
			if(n1%i==0)
			break;
	}
		if(i==n1)
		{
			System.out.println("The number is prime");
		}	
		else
		{	
			System.out.println("The number is not prime");
		}
}

}	