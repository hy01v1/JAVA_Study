package example02;

public class SwitchNestedEX {

	public static void main(String[] args) {

		// switch ��ø, if ��ø ȥ�� ����
		// ����ȭ�� ������ switch����(if���� ���Ͽ�) �������� ����.
		
		int number = 5;

		switch (number) {
		case 1 :
		case 7 :
			switch (number) {
			case 1:
				System.out.println("011 �Դϴ�.");
				break;
			case 7:
				System.out.println("017 �Դϴ�.");
				break;
			}
			break;
			//  ��ø switch �� Ȱ��

		case 6 :
		case 9 :
			if (number == 6) {	//switch (number) {
				System.out.println("016 �Դϴ�.");}	//case 6:
													//System.out.println("016 �Դϴ�.");
													//break;
				else if (number == 9) {
					System.out.println("019 �Դϴ�.");}
//				case 9:
//				System.out.println("019 �Դϴ�.");
//				break;
			break;
			//  => ��ø switch �� if������ ����
			
			default :
	System.out.println("���� ��ȣ�Դϴ�.");
	
	
	
		}}}