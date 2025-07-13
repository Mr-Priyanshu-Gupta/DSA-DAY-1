import java.util.Scanner;

class DSA17
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
		long Sum = 0;
		long Rem = 0;
		long result = 0;
		int place = 1;

		System.out.println("Enter 1st Binary number");
 		 long binary1 = sc.nextLong();
		System.out.println("number 1 is :" + binary1);

		System.out.println("Enter 2nd Binary number");
		 long binary2 = sc.nextLong();
		System.out.println("number 2 is :" + binary2);
	
	  while( binary1 != 0 || binary2 != 0 )
	  {
		
		Sum = (((binary1 % 10) + (binary2 % 10) + Rem) % 2);
		Rem = (((binary1 % 10) + (binary2 % 10) + Rem) / 2);

		result = result + Sum*place;
		place = place*10; 
	
		binary1 = binary1 / 10;
		binary2 = binary2 / 10;			
	  }
		if(Rem != 0)
		{	
		result = result + Rem*place; 
		}
	System.out.println("Sum of binary number is " + ":" + result);
	}
}