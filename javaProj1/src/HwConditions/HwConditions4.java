package HwConditions;

import java.util.Scanner;

public class HwConditions4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("please enter your number");
		long number = s.nextLong();

		while (number != -1) {
			System.out.println("your number is : " + number);
			System.out.println("please enter your number");
			number = s.nextLong();

		}
		s.close();
		System.out.println("---------- End --------------");
	}

}
