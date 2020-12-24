package basic1;

public class Main {

	public static void main(String[] args) {
		// define 2 different cats using the constructors
		Cat cat1 = new Cat("snoopi", "black", 3);
		Cat cat2 = new Cat("mitzi", "white", 4);

		System.out.println("my first cat name is :" + cat1.getName());
		System.out.println("my first cat color is :" + cat1.getColor());

		System.out.println("my second cat name is :" + cat2.getName());
		System.out.println("my second cat color is :" + cat2.getColor());

	}

}
