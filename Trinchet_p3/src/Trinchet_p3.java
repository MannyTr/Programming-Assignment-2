import java.util.Scanner;

public class Trinchet_p3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String topics[] = new String[5];
		int responses[][] = new int[5][10], i, j, choice, rating, divideBy[] = new int[5];
		int total[] = new int[5], max = 0, min = 1000, maxIndex = 0, minIndex = 0;
		double averages[] = new double[5];
		
		// Initializes topics I've chosen for this program
		topics[0] = "Global Warming";
		topics[1] = "Video Games";
		topics[2] = "Food";
		topics[3] = "Politics";
		topics[4] = "Animal Safety";
		
		// Simple menu for user
		System.out.println("Hello! Welcome to my polling program.");
		System.out.println("-----");
		System.out.println("We will be rating the importance of five topics");
		System.out.println("on a scale of 1 (least important) to 10 (most important)");
		System.out.println("using the average result of multiple participants\n");
		
		System.out.println("To begin, select '1' to take the survey and we will record your data.");
		System.out.println("If you are finished and would like to see the results, press '2'.");
		
		choice = scnr.nextInt();
		
		// While the user does not choose '2' to quit,
		// continue asking survey questions
		while (choice != 2)
		{
			// Warning and instructions if input isn't '1' or '2'
			if (choice != 1) {
				System.out.println("Invalid input, please re-run the program and try again");
				break;
			}
			
			// Asks user for opinions on topic importance while keeping track of 
			// amount of responses per topic (divideBy[]), total points per topic (topic[])
			// the user answers themselves in a 2D array (responses[][])
			System.out.println("On a scale of one to ten, please rate the importance of:");
			
			for (i = 0; i < 5; i++)
			{
				System.out.println(topics[i]);
				rating = scnr.nextInt();
				responses[i][rating - 1]++;
				divideBy[i]++;
				total[i] +=	rating;			
			}
			
			// End of survey, asks user if they want to continue or finish
			System.out.println("You've completed the survey! Press '1' to input another survey,");
			System.out.println("or '2' to calculate the results.");
			
			choice = scnr.nextInt();
		}
		
		// Exits while loop, calculates results
		if (choice == 2) {
			System.out.println("Calculating results...\n");
			
			// Stores average points for each topic in averages[]		
			for (i = 0; i < 5; i++) {
				
				for (j = 0; j < 10; j++) {
					averages[i] += ( (j + 1) * responses[i][j] );
				}
				
				averages[i] /= divideBy[i];
			}
			
			// Searches for topics that accumulated the 
			// most and least amount of points in total[]
			for (i = 0; i < 5; i++) {
				if (total[i] > max) {
					max = total[i];
					maxIndex = i;
				}
			}
			
			for (i = 0; i < 5; i++) {
				if (total[i] < min) {
					min = total[i];
					minIndex = i;
				}
			}
			
			// Finally, prints out the required information in 
			// the form of a table
			System.out.format("%-17s", "Ratings");
			
			for (i = 0; i < 10; i++) {
				if (i == 9)
					System.out.printf("%d|", i + 1);
				else
					System.out.printf("%d |", i + 1);
			}
			
			System.out.println();
			System.out.println();
			
			for (i = 0; i < 5; i++) {
				System.out.format("%-15s |", topics[i]);
				
				for (j = 0; j < 10; j++) {
					System.out.printf("%d |", responses[i][j]);
				}
				
				System.out.print(" Average: " + averages[i]);
				System.out.println();
			}
			
			System.out.println();
			System.out.printf("The topic with the most points was %s with %d points.\n", topics[maxIndex], max);
			System.out.printf("The topic with the least points was %s with %d points\n", topics[minIndex], min);
					
	
		}
			
			
		
	}

}

