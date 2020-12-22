package HwArrays;

public class HwArrays1 {

	public static void main(String[] args) {
		// array with 5 numbers find smallest
		
		int[] arr = { 5,8,2,9,0};
		
		findMin(arr);

	}

	private static void findMin(int[] arr) {
		// TODO Auto-generated method stub
		int minOfArr = arr[0];
		for (int i : arr) {
			if (minOfArr > i) {
				minOfArr = i;
			}
		}
		System.out.printf("the minimom of array is : %d ",minOfArr);
	}

}
