import java.util.Arrays;
import java.util.Scanner;

public class Encrypt {
	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		int data, result;
		
		System.out.println("Please enter 4-digit code to encrypt:");
		data = scnr.nextInt();
		
		System.out.println("Encrypting...\n");
		
		encrypt(data);				
	}
	
	public static void encrypt(int n)
	{
		int array[] = new int[4];
		int digit, i;
		
		// Starting from the rightmost digit, add 7 to that digit then mod it by 10 before 
		// adding it to the rightmost slot in the array
		for (i = 3; i >= 0; i--)
		{
			digit = n % 10;
			digit = (digit + 7) % 10;
			array[i] = digit;
			
			n /= 10;
		}
		
		// Once the new digits have been obtained, use a simple array swap function, found below encrypt(), to swap the 1st and 3rd digits
		// and the 2nd and 4th digits
		arraySwap(array, 0, 2);
		arraySwap(array, 1 ,3);	
		
		// Now that the encryption is completed, print out the results
		System.out.println("Your new encrypted code is: ");
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
