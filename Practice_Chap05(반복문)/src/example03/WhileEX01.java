package example03;

public class WhileEX01 {

	public static void main(String[] args) {
		// While �� ����
		
		int sum = 0;
		int i =  1;
		
		// while ���� �ʱ�ȭ �ϴ� �κ��� ����.
		// while ���� ���ǽĸ� �����ϱ� ������ for����(�Ϲ������ο���) ���� �������� ��������.
		while(i<100) {
			sum += i;
			i++;
		}
		System.out.println("1~100 ������ �� : " + sum);
		
		System.out.println("------------------------");
		// C��� ������ booleanŸ���� ����. => 0�� ������ ��� ���� ��(true)���� �ν��Ѵ�.
		//  * while ���� ���� ���� �뵵�� ���� ����Ѵ�.
		//  * ���� ������ ���� ���� �� �ִ� if(����) break; �� ����ϴ� ���� �����Ѵ�.
		int i2 = 1;
		while (true) {
			if (i2>=100) {
				break;
			}
		i2++;
		System.out.println(i2);
	}
		
		
		
	}
}
