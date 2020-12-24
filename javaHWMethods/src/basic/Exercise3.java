package basic;

public class Exercise3 {

	public static void main(String[] args) {

		// here I call the method
		int number = 25;
		int newNumber = calcValue(number);
		System.out.println("The new number is : " + newNumber);

		//Calling again to this method. 
		System.out.println("The number is : " + calcValue(33));
	}

	// Here is the Definition for the method
	public static int calcValue(int number) {
		return number + 5;
	}

}
