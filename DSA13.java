import java.util.Scanner;

class DSA13
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	final double width = 5.6;
        final double height = 8.5;

        double perimeter = 2 * (height + width);
		
        double area = width * height;			

        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
	}
}


