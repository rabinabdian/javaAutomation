package HwArrays;

public class HwArrays2 {

	public static void main(String[] args) {
		// array avg

		int[] arr = { 5, 8, 2, 9, 0 };

		findAvg(arr);

	}

	private static void findAvg(int[] arr) {
		// TODO Auto-generated method stub
		double sum = 0;
		double avg = 0 ;
		for (int i : arr) {
			sum += i;
		}
		avg = sum / arr.length;
		
		System.out.printf("the avg of array is : %.1f ", avg);
	}

}
