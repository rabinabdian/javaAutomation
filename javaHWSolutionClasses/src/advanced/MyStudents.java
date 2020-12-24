package advanced;

public class MyStudents {

	public static void main(String[] args) {

		Student[] students = new Student[5];

		double[] grades1 = { 87, 82, 94, 97 };
		students[0] = new Student("Shahar", "s@gmail.com", true, "0501111111", grades1);

		double[] grades2 = { 90, 99, 98, 100 };
		students[1] = new Student("Rotem", "r@gmail.com", true, "0502222222", grades2);

		double[] grades3 = { 88, 80, 92, 97 };
		students[2] = new Student("Lee", "l@gmail.com", false, "0503333333", grades3);

		double[] grades4 = { 98, 84, 77, 97 };
		students[3] = new Student("Tal", "t@gmail.com", false, "0504444444", grades4);

		double[] grades5 = { 84, 92, 98, 89 };
		students[4] = new Student("Ben", "b@gmail.com", true, "0505555555", grades5);

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString());
		}

		for (int i = 0; i < students.length; i++) {
			System.out.println("Avg " + students[i].getName() + " = " + students[i].calcAvgGrade());
		}

		double sum = 0;
		for (int i = 0; i < students.length; i++) {
			sum = sum + students[i].calcAvgGrade();
		}

		double avg = sum / students.length;
		System.out.println("Avg of all students is : " + avg);

	}
}
