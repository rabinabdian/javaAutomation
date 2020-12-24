package advanced;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		int[] array = new int[5];
		for (int i = 0; i < 5; i++)
			array[i] = input.nextInt();

		System.out.println("The biggest number is:" + findBiggestNumber(array));
		System.out.println("The smallest number is: " + findSmallestNumber(array));
		System.out.println("The sum is: " + calcSum(array));
		System.out.println("The avg is: " + calcAvg(array));
	}

	public static int findBiggestNumber(int[] arrayOfNum) {
		int max = arrayOfNum[0];
		for (int i = 0; i < arrayOfNum.length; i++)
			if (arrayOfNum[i] > max) {
				max = arrayOfNum[i];
			}
		return max;
	}

	public static int findSmallestNumber(int[] arrayOfNum) {
		int min = arrayOfNum[0];
		for (int i = 0; i < arrayOfNum.length; i++)
			if (arrayOfNum[i] < min) {
				min = arrayOfNum[i];
			}
		return min;
	}

	public static int calcSum(int[] arrayOfNum) {
		int sum = 0;
		for (int i = 0; i < arrayOfNum.length; i++)
			sum = sum + arrayOfNum[i];
		return sum;
	}

	public static double calcAvg(int[] arrayOfNum) {
		int sum = 0;
		for (int i = 0; i < arrayOfNum.length; i++) {
			sum = sum + arrayOfNum[i];
		}
		int avg = sum / arrayOfNum.length;
		return avg;
	}

}
