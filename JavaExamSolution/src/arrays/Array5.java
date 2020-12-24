package arrays;

public class Array5 {

	public static void main(String[] args) {
		long[] grades = {90,98,100,94,93};
		String[] names = {"Hila","Gabi","Alon","Mohamad","Nataly"};
		
		long max = grades[0];
		int position = 0;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > max) {
				max = grades[i];
				position = i;
			}
		}
		System.out.println("The student with the highest grade is " + names[position]);

	}

}
