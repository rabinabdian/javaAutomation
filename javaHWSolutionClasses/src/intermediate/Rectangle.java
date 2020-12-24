package intermediate;

public class Rectangle {

	private String color;
	private double recHeight;
	private double recWidth;

	public double getRecHeight() {
		return this.recHeight;
	}

	public void setRecHeight(double recHeight) {
		this.recHeight = recHeight;
	}

	public double getRecWidth() {
		return this.recWidth;
	}

	public void setRecWidth(double recWidth) {
		this.recWidth = recWidth;
	}

	public Rectangle(String color, double recHeight, double recWidth) {
		this.color = color;
		this.recHeight = recHeight;
		this.recWidth = recWidth;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double calcArea() {
		double area = this.recHeight * this.recWidth;
		return area;
	}

}
