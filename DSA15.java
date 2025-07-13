import java.util.Scanner;

class DSA15
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
		int num1 =10; 
		int num2 =20;
		int num3 =30;

		//num1 = num2;
		//num2 = num3;
		//num3 = num1;
		num2 = num2 + num3;
		num3 = num2 - num3;
		num2 = num2 - num3;


		System.out.println(num2 +"  "+ num3);
	}
}


