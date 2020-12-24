package basic2;

public class Main5Cats {

	public static void main(String[] args) {
		Cat[] myCats = new Cat[5];

		myCats[0] = new Cat("snoopi", "black", 3);
		myCats[1] = new Cat("mitzi", "white", 4);
		myCats[2] = new Cat("jin", "orange", 1.5);
		myCats[3] = new Cat("zebra", "balck and white", 2.5);
		myCats[4] = new Cat("doctor grey", "grey", 2);

		// We can print each one of the variable using the getter
		for (int i = 0; i < 5; i++) {
			System.out.println("cat " + myCats[i].getName() + " color is " + myCats[i].getColor() + " and age is "
					+ myCats[i].getAge());
		}

		// we can print all info using a specific methods
		// this is a loop with another format for looping
		for (Cat cat : myCats) {
			cat.printMyInfo();
		}

	}

}
