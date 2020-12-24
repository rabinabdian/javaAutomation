
public class MethodWith2Variables {

	public static void main(String[] args) {
		//פה אני קורא למתודה עם 2 משתנים
		//בשביל לקרוא למתודה יש פשוט לרשום את השם שלה
		printMyName("Gal", 45);
		
		//במהלך התוכנית אני יכול לקרוא למתודה מספר פעמים
		//פה אני קורה למתודה שוב
		String name = "Tomer";
		int age = 38;
		printMyName(name, age);
		
	}
	
	//פה הגדרתי את המתודה שמקבלת משתנה מסוג מחרוזת 
	public static void printMyName(String myName, int myAge) {
		System.out.println("My name is " + myName);
		System.out.println("My age is " + myAge);
	}

}
