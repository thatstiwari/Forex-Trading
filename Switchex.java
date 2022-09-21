	import java.util.Scanner;
	
	public class Switchex
{
	public static void main(String args[])
{
	int var,a,b;
	Scanner n = new Scanner(System.in);
	System.out.println("Enter two number");
	a = n.nextInt();
	b = n.nextInt();
	System.out.println("Enter your choice of artmetic operation");
	System.out.println(" press 1 for addition");
	System.out.println(" press 2 for substraction");
	System.out.println(" press 3 for mutiplictaion");
	System.out.println(" press 4 to exit");
	var = n.nextInt();
	
	switch(var)
{
	case 1:
		System.out.println("sum = " + (a+b));
	break;
	case 2:
		System.out.println("subs = "+(a-b));
	break;
	case 3: 
		System.out.println("answer = "+a*b);
	break;
	default:
		System.out.println(" Exit");
}

}
}
 