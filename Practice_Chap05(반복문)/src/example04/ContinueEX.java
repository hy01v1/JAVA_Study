package example04;

public class ContinueEX {

	public static void main(String[] args) {
		
		// 1~100 ������ ������ Ȧ��(¦��)�� ����ϴ� ���α׷� ����
		//  * 1~31�� ���� ���� ; �ʹ� ����.
		
		System.out.println("Ȧ���� ����ϴ� ���α׷�");
		for (int i=1; i<=31; i++) {
			if ((i%2) == 0) {
			continue; //continue �� true�� �� �ܺ� ���������� �ٷ� �̵��Ѵ�.
		}
			 System.out.println("Ȧ�� : " + i );
		}
		System.out.println("-----------------------");
		
		System.out.println("¦���� ����ϴ� ���α׷�");
		for (int i=1; i<=31; i++) {
			if ((i%2) != 0) {
			continue; //continue �� true�� �� �ܺ� ���������� �ٷ� �̵��Ѵ�.
		}
			 System.out.println("¦�� : " + i );
		}
		System.out.println("-----------------------");
		
		System.out.println("2�� 3�� ������� ����ϴ� ���α׷�");
		for (int i=1; i<=31; i++) {
			if ((i%2) == 0 && (i%3) == 0 ) {
				 System.out.println("2�� 3�� ����� : " + i );
				continue; 
		}
		}
		System.out.println("-----------------------");
		
		
		
		
		
		
		
		
	}

}
