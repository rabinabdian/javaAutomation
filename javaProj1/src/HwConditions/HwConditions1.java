package HwConditions;

public class HwConditions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long age = 30;
		
		ageFinder(age);
	}

	private static void ageFinder(long age) {
		if (age<18) {
			System.out.println("u r very young ");
			
		}
		
		if (age>66) {
			System.out.println("u r pensioner ");

		}
		
		if (age==18) {
			System.out.println(" u r 18");
		}
		
		System.out.println("---- end ----");
	}

}
