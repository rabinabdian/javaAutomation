package HwConditions;

import java.util.Scanner;

public class HwConditions6 {

	public static void main(String[] args) {
		// finding prime numbers between 0 - 100

		 Scanner sc = new Scanner(System.in);
	        // Declare the variables
	        int a, b, i, j, flag;
	 
	        // Ask user to enter lower value of interval

	        a = 0; // Take input
	 
	        // Ask user to enter upper value of interval
	        b = 100; // Take input
	 
	        // Print display message
	        System.out.printf("\nPrime numbers between %d and %d are: ", a, b);
	        System.out.println();

	        // Traverse each number in the interval
	        // with the help of for loop
	        for (i = a; i <= b; i++) {
	 
	            // Skip 0 and 1 as they are
	            // niether prime nor composite
	            if (i == 1 || i == 0)
	                continue;
	 
	            // flag variable to tell
	            // if i is prime or not
	            flag = 1;
	 
	            for (j = 2; j <= i / 2; ++j) {
	                if (i % j == 0) {
	                    flag = 0;
	                    break;
	                }
	            }
	 
	            // flag = 1 means i is prime
	            // and flag = 0 means i is not prime
	            if (flag == 1)
	                System.out.println(i);
	        }


		
	}

}
