package HwArrays;

public class HwArrays3 {

	public static void main(String[] args) {
		// array reverse

		int[] arr = { 5, 8, 2, 9, 0 };

		reverseArr(arr);

	}

	private static void reverseArr(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("--------- array before reverse ---------");
		for (int i : arr) {
			System.out.print(i);
		}

		for (int i = 0; i < arr.length / 2; i++) {

			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;

		}
		System.out.println();
		System.out.println("--------- array after reverse ---------");
		for (int i : arr) {
			System.out.print(i);
		}
	}

}
