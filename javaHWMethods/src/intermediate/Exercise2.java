package intermediate;

public class Exercise2 {

	public static void main(String[] args) {
		int[] numbers = { 55, 10, 24, 35, 65, 53 };

		System.out.println(findMinimum(numbers));
		int a = findMinimum(numbers);

	}

	public static int findMinimum(int[] numbers) {
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}

}
