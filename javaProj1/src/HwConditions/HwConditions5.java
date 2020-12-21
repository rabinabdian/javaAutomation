package HwConditions;

import java.util.Scanner;

public class HwConditions5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("please enter your age");
		long age = s.nextLong();

		while (age != -1) {
			System.out.println("your age is : " + age);

			if (age < 18) {
				System.out.println("you are child ");
			} else {

				if (age > 65) {
					System.out.println("you are pensioner ");

				}
			}
			System.out.println("please enter your age");
			age = s.nextLong();

		}
		s.close();
		System.out.println("---------- End --------------");
	}

}
