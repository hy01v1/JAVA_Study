package example03;

public class LogicalOperEX {

	public static void main(String[] args) {

		// �������� (&&, ||) ����
		
		boolean result0 = false;
		int i0 = 11;
		boolean result1 = false;
		int i1 = 22;
		boolean result2 = false;
		int i2 = 71;

		boolean result3 = false;
		char ch1 = 'b';
		boolean result4 = false;
		char ch2 = 'C';
		
		//??  result5 �� ���� �ٸ��� ??
		boolean r5 = false;
		int i3 = 13;
		
		
		result0 = (i0 > 5);
		System.out.println("0. (i > 5) : " + result0);
		System.out.println("  =>5���� ū int��" + "**" +  i0 + "**");
		result1 = (i1 >= 9) && (i1 < -8);
		System.out.println("1. result = (i >= 9) && (i < -8); : " + result1);
		System.out.println("  =>9�̻� �̸鼭, -8���� ���� int��" + "**" + i1 + "**");
		result2 = (i2 >= 9) || (i2 < -8);
		System.out.println("2. result = (i >= 9) || (i < -8); : " + result2);
		System.out.println("  =>9�̻� �̰ų�, -8���� ���� int��" + "**" + i2 + "**");

	//�ƽ�Ű�ڵ尪�� ������ ����� �ȴ�.	
		
		result3 = (ch1 > 'a' && ch1 <= 'z');
		System.out.println("3. (ch1 > 'a' && ch1 <= 'z'); : " + result3);
		System.out.println("  =>ch1 �� ����� ������ �ҹ������� Ȯ���ϴ� ��"+ "**" + ch1 + "**");
		// ch1 �� ����� ������ �ҹ������� Ȯ���ϴ� ��
		
		result4 = (ch2 > 'a' && ch2 <= 'z') || (ch2 > 'A' && ch2 <= 'Z');
		System.out.println("4. (ch2 > 'a' && ch2 <= 'z') || (ch > 'A' && ch <= 'Z'); : " + result4);
		System.out.println("  =>ch2 �� ����� ������ ���ĺ����� Ȯ���ϴ� ��"+ "**" + ch2 + "**");
		// ch2 �� ����� ������ ���ĺ����� Ȯ���ϴ� ��
		
		r5 = (i3 > 0 && i3 <= 9);
		// ����!! '', "", () ��� Ȯ���ʼ�
		System.out.println("5. (i3 > '0' && i3 <= '9'); :" + r5);
		System.out.println("  =>i3 �� ����� ������ ���ڸ� �ڿ������� Ȯ���ϴ� ��"+ "**" + i3 + "**");
		// i3 �� ����� ������ ���ڸ� �ڿ������� Ȯ���ϴ� ��
		
		
		
		
		
		
		
		
		
		
	}

}
