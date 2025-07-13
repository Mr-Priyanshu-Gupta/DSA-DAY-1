import java.util.Scanner;

class DSA5
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
 		int num1 = sc.nextInt();
	 	System.out.println("number 1 is :" + num1);
		System.out.println("Enter 2nd your number");
		int num2 = sc.nextInt();
		System.out.println("number 2 is :" + num2);
		int Mul = num1 * num2;
		System.out.println(num1 + " x " + num2 +" = "+ Mul);
		
	}
}

