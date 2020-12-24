package advanced;

public class Exercise1 {

	public static void main(String[] args) {
		// Create the 2 array
		int[] array1 = { 21, 5, 33, 55, 2, 77, 9, 34, 8, 5 };
		int[] array2 = { 21, 5, 33, 55, 2, 77, 9, 34, 8, 5 };
		int number = 77;
		boolean isArrayEqual = comapreArrays(array1, array2);
		if (isArrayEqual)
			System.out.println("Tha arrays are equal");
		else
			System.out.println("Tha arrays are NOT equal");
	}

	public static boolean comapreArrays(int[] array1, int[] array2) {
		// if the array are not in the same length then its not equal for sure
		if (array1.length != array2.length) {
			return false;
		}
		// if we are here then the array have the same length and we can compare the
		// items
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				// if one of the item is not equal then the arrays are not equal
				return false;
			}
		}
		// if we are here, it means that the array have the same length
		// and all items are equal.
		// this means that the arrays are equals
		return true;
	}

}
