package intermediate;

public class Circle {

	private double radius;
	private String color;

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calcArea() {
		// are for circle = (radius * radius) * PI
		double result = (Math.PI * Math.pow(radius, 2));
		return result;
	}

}
