import java.util.Scanner;
public class prob_1 {
	
	public static int encrypt( int n)
	{
	   // Obtain the digits of the number.
	   int a = n / 1000;
	   int b = (n % 1000) / 100;
	   int c = (n % 100) / 10;
	   int d = n % 10;
	   // Replace each digit by adding 7 to the digit
	   // Get the remainder after dividing the new value by 10
	   a = (a + 7) % 10;
	   b = (b + 7) % 10;
	   c = (c + 7) % 10;
	   d = (d + 7) % 10;
	   return (c * 1000 + d * 100 + a * 10 + b); // Swap 1st and 3rd digit. Swap 2nd and 3rd digit. Generate end result
	}

	public static int decrypt( int n)
	{
	   // Obtain the digits of the number
	   int a = n / 1000;
	   int b = (n % 1000) / 100;
	   int c = (n % 100) / 10;
	   int d = n % 10;
	   // Replace each digit by subtracting 7 to the digit
	   // Get the remainder after dividing the new value by 10
	   a = (a + 3) % 10;
	   b = (b + 3) % 10;
	   c = (c + 3) % 10;
	   d = (d + 3) % 10;
	   return (c * 1000 + d * 100 + a * 10 + b);
	}


	public static void main(String []args){
	Scanner scnr = new Scanner(System.in);
	    int n;
	   System.out.println("Enter four-digit number: ");
	   n= scnr.nextInt();
	   System.out.println("Encrypted number is: "+encrypt(n)); // Display encrypted number
	   System.out.println("Result after encrypt-decrypt cycle is: "+decrypt(encrypt(n))); // Display original number
	   
	   scnr.close();
	}

}