package example01;

public class OperatorEX {

	public static void main(String[] args) {

		int v1 = 5;
		int v2 = 2;
		
		int result = v1 + v2;
		System.out.println("���ϱ� ��� = " + result);
		 
		result = v1 - v2;
		System.out.println("���� ��� = " + result);
		
		result = v1 * v2;
		System.out.println("���ϱ� ��� = " + result);
		
		result = v1 / v2;
		System.out.println("������ ��� = " + result);
		
		result = v1 % v2;
		System.out.println("������ ��� = " + result);
		// %�� �������� ���ϴ� ������
		
		//result = v1 / 0;
		//System.out.println("0���� ���� �� = " + result);
		// 0�� ������ �ȵȴ� ; ��� ���� ���ܰ� �߻��Ѵ�.
		
		try {
				result = v1 / 0;
		}catch (Exception e) {
		System.out.println("���ܹ߻� = " +  e.toString());
		// ������꿹�� ó�� ���
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
