package example01;

public class ArrayEX00 {

	public static void main(String[] args) {
				
		// �迭 ����

		int[] arr1 = new int[3];
		// -> 4*3=12bite ���� �� 0���� �ʱ�ȭ
		int[] arr2 = new int[] {1,2,3};
		// -> 4*3=12bite ���� �� 1,2,3 ������ �ʱ�ȭ
		
		int[] arr3 = null;
//		arr3 = {1,2,3};
		// new �����ڷ� ������ �������� �ʾƼ� �ʱ�ȭ ���� �ַ� �߻�
		arr3 = new int[] {4,5,6};
		// new �����ڷ� ���� �����ϰ�, 4,5,6������ �ʱ�ȭ
	
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		
	}

}
