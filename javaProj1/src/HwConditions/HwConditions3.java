package HwConditions;

import java.util.Scanner;

public class HwConditions3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter number");

		String userInput = myObj.nextLine(); // Read user input
		System.out.println("number is: " + userInput); // Output user input
		
		 oddOrEven( Integer.parseInt(userInput));

	}

	
	public static void oddOrEven(int num) {
		if (num%2==0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");

		}
	}
}
