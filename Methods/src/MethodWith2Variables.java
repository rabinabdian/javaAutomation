
public class MethodWith2Variables {

	public static void main(String[] args) {
		//�� ��� ���� ������ �� 2 ������
		//����� ����� ������ �� ���� ����� �� ��� ���
		printMyName("Gal", 45);
		
		//����� ������� ��� ���� ����� ������ ���� �����
		//�� ��� ���� ������ ���
		String name = "Tomer";
		int age = 38;
		printMyName(name, age);
		
	}
	
	//�� ������ �� ������ ������ ����� ���� ������ 
	public static void printMyName(String myName, int myAge) {
		System.out.println("My name is " + myName);
		System.out.println("My age is " + myAge);
	}

}
