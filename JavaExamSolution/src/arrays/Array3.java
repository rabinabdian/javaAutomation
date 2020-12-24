package arrays;

public class Array3 {

	public static void main(String[] args) {
		int[] numbers = {10,4,6,80,99};
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 80) {
				System.out.println("find 80");
			}
		}
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum =  sum + numbers[i];
		}
		int avg = sum / numbers.length;
		System.out.println(avg);
	}

}
