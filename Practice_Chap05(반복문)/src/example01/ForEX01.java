package example01;

public class ForEX01 {

	public static void main(String[] args) {


		// for �� ����!
		
		int sum =0;
		for(int i=1; i<=100; i++)	// Braekpoint �� �Ѵܰ辿 Ȯ�� �����ϴ�.(Variables, F8 key�� ����)
		// single loop
		// int i=1	-> �ʱ�ȭ �ڵ�( ���� 1���� ���� )
		// i<=100	-> ���ǽ� �ڵ�(���� ��츸 ����(���Ǻ�))
		// i++		-> ������ �ڵ�
		{
			System.out.println("���� sum �� : " + sum);
			sum += i;
		}
		System.out.println("1~100������ �� : " + sum);
		// 1~100 ������ ���� ���ϴ� �ݺ���
		
		System.out.println("----------------------------");
		
		
		
		
	}

}
