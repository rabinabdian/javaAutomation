package basic;

public class Exercise2 {

	public static void main(String[] args) {
		// here I call the method using it name.
		// This method is getting one parameter as String
		// and return no parameters
		String myName = "Gal";
		PrintYourName(myName);

		// Here I call again to the same method
		PrintYourName("Shiri");
	}

	// Here is the Definition for the method
	// The method get String as parameter
	public static void PrintYourName(String name) {
		System.out.println("My name is " + name);
	}

}
