import java.util.Scanner;


public class Decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInput;
		
		
		System.out.println("Please enter 4-digit integer to decrypt:");
		userInput = scnr.nextInt();
		
		System.out.println("Decrypting...\n");
		
		decrypt(userInput);
		
		
		

	}
	
	// Has very similar code to encrypt(), but in reversed order
	public static void decrypt(int n)
	{
		int i, array[] = new int[4], res = 0;
		
		// Put all the digits in an array in order to swap the 1st and 3rd element
		// then the 2nd and 4th elements
		for (i = 3; i >= 0; i--)
		{
			array[i] = n % 10;
			n /= 10;
		}
		
		// Swap the elements with simple array swap function 
		arraySwap(array, 0, 2);
		arraySwap(array, 1 ,3);	
		
		// Finally, reverse the encryption by subtracting 7, adding 10 if the digit goes below 0
		// to obtain the original value
		for (i = 0; i < 4; i++)
		{
			array[i] = array[i] - 7;
			if (array[i] < 0)
				array[i] = 10 + array[i];
		}
		
		// Print out the results now that the code has been decrypted
		System.out.println("Your new decrypted code is:");
		for (i = 0; i < 4; i++)
			System.out.print(array[i]);
	}
	
	public static void arraySwap(int array[], int a, int b)
	{
		int temp;
		temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	

}
