
public class MethodWith2Variables2 {

	public static void main(String[] args) {
		//פה אני קורא למתודה עם 2 משתנים
		//המתודה מקבלת 2 משתנים ומחזירה את הסכום
		
		double sum = calculateSum(2.6, 5.5);
		System.out.println("the sum is = " + sum);
		
		//במהלך התוכנית אני יכול לקרוא למתודה מספר פעמים
		//פה אני קורה למתודה שוב
		double num1 = 13.4;
		double num2 = 15.4;
		sum = calculateSum(num1,num2);
		System.out.println("the sum is = " + sum);
		
	}
	
	//פה הגדרתי את המתודה שמקבלת משתנה מסוג מחרוזת 
	public static double calculateSum(double number1, double number2) {
		return number1 + number2;
	}

}
