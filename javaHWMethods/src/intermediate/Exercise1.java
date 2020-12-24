package intermediate;

public class Exercise1 {

	public static void main(String[] args) {
		
		// here I call the method using it name.
		int min = minValue(21, 5, 33);
		System.out.println("The minimun number is " + min);

		// another call to this method
		System.out.println("The minimun number is " + minValue(1, 7, 30));
	}

	// Simple Definition for method
	public static int minValue(int number1, int number2, int number3) {
		if ((number1 < number2) && (number1 < number3)) {
			return number1;
		} else
			 if (number2 < number3) {
			return number2;
		}
		// return number3 as the minimum, because both number 1 & number 2 are not smaller
		return number3;
	}

}
