package example01;

public class VarEx03 {

	public static void main(String[] args) {
		
		byte b1 = 127;
		//byte b2 = b1 + 2;
		byte b2 = (byte)(b1 + 2);
				
		System.out.println(b1);
		System.out.println("�����÷ο� = " + b2);
		// byte ������� 127�� �Ѱ�, 128�̻� ���ʹ� �����÷ο� �߻�
		
		int i1 = b1;
		System.out.println("�����ɽ��� = " + b1);
		System.out.println("�����ɽ��� = " + i1);
		
		
		byte b3 = 127;
		int i2 = 400;
		b3 = (byte)i2;
		// ū ����Ʈ -> ���� ����Ʈ = �ս� �߻� (b3)
		System.out.println(b3);
		
		int i3 = 100;
		float f1 = (float)i3;
		System.out.println("���� -> �Ǽ� = " +  f1);
		
		int i4 = (int)f1;
		System.out.println(i4);
		
		char ch = 'a';
		int i5 = ch;
		System.out.println("���� -> ���� = " + i5);
		// ���ڸ� ����Ÿ��(ex, int)���� �ٲٰ� �Ǹ� �ƽ�Ű�ڵ� ������ ����� �ȴ�.
		
		int i6 = 123;
		String str = "�ڹ�" + i6;
		System.out.println("���ڿ� Ÿ�� ��ȯ + " + str);
		// any type + "" = ���ڿ� Ÿ�� �ڵ� ��ȯ
		
		
		
	}

}
