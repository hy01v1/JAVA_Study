package example02;

public class SwichEX {

	public static void main(String[] args) {
		// 

		int score = 88;
		
		switch(score/10){
		// switch ()=> int ������ ������, String ��

//switch(score){
		case 95 :
			System.out.println("95���Դϴ�.");
			break;
			// break �� �������� ������, �Ʒ��� system.out �� ��� ����Ѵ�.
		case 94 :
			System.out.println("94���Դϴ�.");
			break;
		case 93 :
			System.out.println("93���Դϴ�.");
			break;
//		default :
//			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
			// (/10)���� ������ ������ ��� �ڵ�
		case 10 :
			System.out.println("A����Դϴ�.");
			break;
			// break �� �������� ������, �Ʒ��� system.out �� ��� ����Ѵ�.
		case 9 :
			System.out.println("B����Դϴ�.");
			break;
		case 8 :
			System.out.println("C����Դϴ�.");
			break;
		default :
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");

			
			
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
