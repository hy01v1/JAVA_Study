package example01;

public class ForEX02 {

	public static void main(String[] args) {

		// ���� �հ谡 2000�̻��� �� i�� ���� ����Ͻÿ�.
		// single loop "for"�� ����
		
		int sum =0;
		int temp =0;
		for(int i=1; i<=100; i++)
			// ����� -> debug â�� �˾��� ��, ���α׷��� ������ �����.
			//  -> �߻��� ������ �ذ� �� ���� ������ ����� �̶� �Ѵ�.
			// Breakpoint(������) �� �Ѵܰ辿 Ȯ�� �����ϴ�.(Variables, F8 key�� ����)

		{
			sum += i;
			if(sum >= 2000) {
				temp  = i;
				System.out.println("���� �հ谡 2000�̻��� ��  sum �� : " + sum);
				break;

			}}

		System.out.println("----------------------------");
		
		System.out.println("���� �հ谡 2000�̻��� �� i�� �� : " + temp);
		// 1~100 ������ ���� ���ϴ� �ݺ���
		
		System.out.println("----------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
