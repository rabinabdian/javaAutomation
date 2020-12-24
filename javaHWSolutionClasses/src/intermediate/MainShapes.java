package intermediate;

public class MainShapes {

	public static void main(String[] args) {
		Rectangle Rectangle1 = new Rectangle("red", 5, 3);
		Circle Circle1 = new Circle(4.1, "black");

		System.out.println("The area of the rectangle is " + Rectangle1.calcArea());
		System.out.println("The color of the rectangle is " + Rectangle1.getColor());

		System.out.println("The area of the circle is " + Circle1.calcArea());
		System.out.println("The color of the circle is " + Circle1.getColor());
	}

}
