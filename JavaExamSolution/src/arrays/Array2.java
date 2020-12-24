package arrays;

public class Array2 {

	public static void main(String[] args) {
		long[] numbers = {77,20,55,8,10};
//		numbers[0] = 30;
//		numbers[numbers.length - 1] = 50;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[numbers.length - 1]);
		
		long temp = numbers[0];
		numbers[0] = numbers[numbers.length - 1];
		numbers[numbers.length - 1] = temp;
		System.out.println(numbers[0]);
		System.out.println(numbers[numbers.length - 1]);
	}

}
