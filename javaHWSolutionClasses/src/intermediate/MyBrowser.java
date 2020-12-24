package intermediate;

import java.util.Scanner;

public class MyBrowser {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String browser;
		System.out.println("Please enter a Browser name: ");
		browser = input.next();

		switch (browser.toLowerCase()) {
		case "firefox":
			System.out.println("The color of firefox is blue");
			break;
		case "chrome":
			System.out.println("The color of chrome is red");
			break;
		case "edge":
			System.out.println("The color of edge is yellow");
			break;
		default: // if none of the above
			System.out.println("The color is green");
			break;
		}

		input.close();
	}

}
