import java.util.Scanner;
	
	public class Cube
{	
	public static void main(String args[])

{
	Scanner n = new Scanner(System.in);
	System.out.println("Enter any number");
	int a = n.nextInt();
	int cb= a*a*a;
	System.out.println("Cube of the number is   ="+cb);
}
}	