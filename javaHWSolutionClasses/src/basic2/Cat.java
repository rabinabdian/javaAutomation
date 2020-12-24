package basic2;

public class Cat {

	private String name;
	private String color;
	private double age;

	/*
	 * This is the constructor you can create the constructor by going to main menu
	 * --> Source --> 'Generate constructor...'
	 */
	public Cat(String name, String color, double age) {
		// because both variables called name.
		// in the class and in the method we are using 'this'
		// this means that the variable belong to the class
		this.name = name;
		this.color = color;
		this.age = age;
	}

	/*
	 * This is the setters & getters you can create it automatically by main menu
	 * --> Source --> 'Generate Getters & Setters'
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public void printMyInfo() {
		System.out.println("my name is " + getName());
		System.out.println("my color is " + getColor());
		System.out.println("my age is " + getAge());
		System.out.println("----------------------");
	}

}
