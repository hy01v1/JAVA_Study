package example01;

import java.util.Arrays;

public class ArrayEX03 {

	public static void main(String[] args) {

		// ���� �ʿ�
		
		int[] arr1 = new int [10];
		// 40bite �� heap�� �����Ǿ���.
		char[] chArr = new char[] { 'a', 'b', 'c'};
		// 6bite �� heap�� �����Ǿ���.
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = (int)(Math.random()*10)+1;
			// ���� : 1~10 ���� �� ������ ����
		}
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
			// �迭�� ���� ���
		}
		System.out.println();
		System.out.println("------------------------------");

		for(int i=0; i<arr1.length; i++) {
			if(i == 9) {
				System.out.print(arr1[i]);
			}
			else {
				System.out.print(arr1[i] + ", ");
				// �迭�� ���� ���� ���� ���
			}
		}
			System.out.println();
			System.out.println(Arrays.toString(arr1));
			// Arrays Ŭ������ �迭�� �����ϱ� ���� ����� ���� ��ƿ��Ƽ Ŭ�����̴�.
			System.out.println(Arrays.toString(chArr));
		
		System.out.println(arr1);	//int Ÿ���� ��µȴ�. ��½� ����������.toString()ȣ���� �ڵ����� �Էµȴ�.
		System.out.println(arr1.toString());	//int Ÿ���� ��µȴ�. ��½� ����������.toString()ȣ���� �ڵ����� �Էµȴ�.
		System.out.println(chArr);	//char Ÿ���� ��µȴ�. �����ڵ� ����
		System.out.println(chArr.toString());	//char Ÿ���� �ּҰ� ��µȴ�.(toString())�޼��带 ȣ���ؾ� ����� �ȴ�.
		//�ּҰ� ��� ���(��� ��Ʈ���� �޼��带 Ȱ���ؾ� �ּҰ� ��µȴ�.)
		
	}

}
