package example03;

public class RandomEX {

	public static void main(String[] args) {

		// if���� Math.random() �޼��� ��� ����

		System.out.println(Math.random());
		//Math random �� ���� 0.00000~0, 0.99999~9 ������ ���� ����Ѵ�.
		
		int num = (int)(Math.random()*6)+1;
		// 1 ~ 6 ������ �������� ��½�
		System.out.println(num);
		
		if (num == 1) {
			System.out.println("��� ��ȣ : 1");
		}
		else if (num == 2) {
			System.out.println("��� ��ȣ : 2");
		}
		else if (num == 3) {
			System.out.println("��� ��ȣ : 3");
		}
		else if (num == 4) {
			System.out.println("��� ��ȣ : 4");
		}
		else if (num == 5) {
			System.out.println("��� ��ȣ : 5");
		}
		else {
			System.out.println("��� ��ȣ : 6");
		}
		// switch ������ ���� ������ if �� �̴�.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
