package pointjour2_PA2;

import java.util.Scanner;
public class problem_2
{
public static void main(String[] args)
{
double pounds,inches,kilograms,meters,BMI=0; // Declare variables pounds, inches, kilograms, meters, and BMI=0
Scanner input = new Scanner(System.in); // Scan for user input
System.out.println("Choose one option for inputs height and weight: \n 1.pounds and inches \n2. kilograms and Meters"); // Prompt user to choose option for height and weight
int option=input.nextInt();
switch(option)
{
case 1:System.out.println("Enter weight in pounds :"); // Display message when user enters 1
pounds=input.nextDouble();
System.out.println("Enter height in inches :");
inches=input.nextDouble();
BMI= 703*pounds / (inches*inches);	// Formula for BMI
break;
case 2:System.out.println("Enter weight in kilograms:");	// Display message when user enters 2
kilograms=input.nextDouble();
System.out.println("Enter height in meters:");
meters=input.nextDouble();
BMI= kilograms / (meters*meters);
break;

default:System.out.println("invalid choice");	// Display error message 
break;
}
if(BMI<=18.5)
System.out.println("BMI is less than 18.5 means: UnderWeight");
else if(BMI<=24.9)
System.out.println("BMI between 18.5 and 24.9 means: Healthy");
else if(BMI<=29.9)
System.out.println("BMI between 25 TO 29.9 means: Overweight");
else
System.out.println("BMI greater than or equal to 30.0 means: obese");

input.close();
}

}