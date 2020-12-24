package basic3;

public class MainShapes {

	public static void main(String[] args) {

		Rectangle Rectangle1 = new Rectangle(8.5, "pink");
		Circle Circle1 = new Circle(5.8, "blue");

		System.out.println(Rectangle1.toString());
		System.out.println(Circle1.toString());

		// more option to print objects
		System.out.println("The area of the rectangle is " + Rectangle1.getArea());
		System.out.println("The color of the rectangle is " + Rectangle1.getColor());
		System.out.println("The area of the circle is " + Circle1.getArea());
		System.out.println("The color of the circle is " + Circle1.getColor());
	}
}
