package intermediate;

public class Exercise3 {

	public static void main(String[] args) {

		int[] numbers = new int[4];
		numbers[0] = 10;
		numbers[1] = 5;
		numbers[2] = 8;
		numbers[3] = 22;

		boolean isExist = isNumberExist(numbers, 8);
		if (isExist) {
			System.out.println("find the number");
		}

	}

	public static boolean isNumberExist(int[] numbers, int a) {
		for (int i = 0; i < numbers.length; i++) {
			if (a == numbers[i]) {
				return true;
			}
		}
		return false;

	}

}
