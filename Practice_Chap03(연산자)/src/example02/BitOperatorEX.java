package example02;

public class BitOperatorEX {

	public static void main(String[] args) {

		// ��Ʈ ������ -> & , | , ^
		
		int x1 = 8;
		int y1 = 5;
		int x2 = -8;
		int y2 = -5;
		
		System.out.println("x�� 2������ ��ȯ -> " + Integer.toBinaryString(x1));
		System.out.println("x�� 2������ ��ȯ -> " + Integer.toBinaryString(y1));
		System.out.println("------------------------------");
		
		System.out.println("x�� 2������ ��ȯ -> " + Integer.toBinaryString(x2));
		System.out.println("x�� 2������ ��ȯ -> " + Integer.toBinaryString(y2));
		System.out.println("------------------------------");
		
		System.out.println("x�� y�� ��Ʈ���� -> &(AND)���� : " + (x1 & y1));
		System.out.println("x�� y�� ��Ʈ���� -> |(OR)���� : " + (x1 | y1));
		System.out.println("x�� y�� ��Ʈ���� -> ^(XOR)���� : " + (x1 ^ y1));
		System.out.println("------------------------------");

		System.out.println("x�� y�� ��Ʈ���� -> &(AND)���� : " + (x2 & y2));
		System.out.println("x�� y�� ��Ʈ���� -> |(OR)���� : " + (x2 | y2));
		System.out.println("x�� y�� ��Ʈ���� -> ^(XOR)���� : " + (x2 ^ y2));
		System.out.println("------------------------------");

		// AND ������ 1, 1 �϶� 1�� ���
		// OR ������ 1 �� ������ 1�� ���
		// XOR ������ ���� �ٸ� �� 1�� ��� ( = ��Ÿ������_exclusive or)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
