package loops;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Please insert number");
		long grade = read.nextLong();

		if (grade < 55) {
			System.out.println("Fail");
		} else {
			if (grade > 90) {
				System.out.println("You are super");
			}
		}
		read.close();
	}

}
