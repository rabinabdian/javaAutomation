
public class MethodWithVariableString {

	public static void main(String[] args) {
		// פה אני קורא למתודה ללא משתנים
		//בשביל לקרוא למתודה יש פשוט לרשום את השם שלה
		printMyName("Gal");
	}
	
	//פה הגדרתי את המתודה שמקבלת משתנה מסוג מחרוזת 
	public static void printMyName(String myName) {
		
		System.out.println("My name is " + myName);
		
	}

}
