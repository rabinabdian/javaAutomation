
public class MethodWith2Variables2 {

	public static void main(String[] args) {
		//�� ��� ���� ������ �� 2 ������
		//������ ����� 2 ������ ������� �� �����
		
		double sum = calculateSum(2.6, 5.5);
		System.out.println("the sum is = " + sum);
		
		//����� ������� ��� ���� ����� ������ ���� �����
		//�� ��� ���� ������ ���
		double num1 = 13.4;
		double num2 = 15.4;
		sum = calculateSum(num1,num2);
		System.out.println("the sum is = " + sum);
		
	}
	
	//�� ������ �� ������ ������ ����� ���� ������ 
	public static double calculateSum(double number1, double number2) {
		return number1 + number2;
	}

}
