import java.util.Scanner;

public class Trinchet_p2 {
	
	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		double BMI, heightMeters;
		int weight, heightInches, choice;
		
		// Simple menu system to allow the user to select their preferred formula
		System.out.println("Hello, thank you for using this BMI calculator.");
		System.out.println("This calculator uses your weight and heightInches to calculate your BMI. First, select which formula you would like to use:");
		System.out.println("-------");
		
		System.out.println("Option 1: (703 * Pounds) / (Inches^2)");
		System.out.println("Option 2: Kilograms / (Meters^2)");
		
		choice = scnr.nextInt();
		
		// Performs BMI calculations for Pounds and Inches
		if (choice == 1)
		{
		System.out.println("First, please enter your weight in pounds");
		weight = scnr.nextInt();
		
		System.out.println("Second, please enter your heightInches in inches");
		heightInches = scnr.nextInt();
		
		BMI = (703.0 * (double)weight) / (heightInches * heightInches);
		
		System.out.printf("Your BMI is %.1f\n\n", BMI);
		
		// A short menu function that shows the user official BMI categories and values
		displayCategories();	
		}
		
		// Performs BMI calculations for Kilograms and Meters
		else if (choice == 2)
		{
			System.out.println("First, please enter your weight in kilograms");
			weight = scnr.nextInt();
			
			System.out.println("Second, please enter your heightInches in meters");
			heightMeters = scnr.nextDouble();
						
			BMI = ((double)weight) / (heightMeters * heightMeters);
			
			System.out.printf("Your BMI is %.1f\n\n", BMI);
			
			displayCategories();
			
		}
		
		// Warning and instructions regarding choices that aren't 1 or 2
		else
			System.out.println("Invalid choice, please re-run and try again.");
		
		
		
	}
	
	// Prints BMI categories and values
	public static void displayCategories()
	{
		System.out.println("---BMI Categories---");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = BMI of 30 or greater");



		
	}

}
