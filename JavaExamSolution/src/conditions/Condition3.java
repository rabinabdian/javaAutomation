package conditions;

public class Condition3 {

	public static void main(String[] args) {
		long a = 10;
		long b = 20;
		long c = 25;
		if ((a > b) && (a > c)) {
			System.out.println("a is bigger");
		} 
		if (b > a && b > c) {
			System.out.println("b is bigger");
		}
		if (c > a && c > b) {
			System.out.println("c is bigger");
		}

	}

}
