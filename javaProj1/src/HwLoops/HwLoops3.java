package HwLoops;

import java.util.Scanner;

public class HwLoops3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter number");

		String userInput = myObj.nextLine(); // Read user input
		
		while (Integer.parseInt(userInput) != -1) {
			System.out.println("number is: " + userInput); // Output user input
			System.out.println("Enter number");

			 userInput = myObj.nextLine(); // Read user input
		}
		System.out.println("-------- game over ----------1");
//		 oddOrEven( Integer.parseInt(userInput));

	}

}
