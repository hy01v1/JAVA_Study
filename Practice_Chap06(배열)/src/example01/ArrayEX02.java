package example01;

public class ArrayEX02 {

	public static void main(String[] args) {
		
		
		int sum = 0; // ����
		double avg = 0.0; // ���
		
		int[] score = new int[] {100,200,300};
		
		System.out.println("�迭�� ũ�� : " + score.length);
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		// �迭�� �� ��ҵ��� ���� ���ϴ� �� (����)
		}
		
		avg = sum / score.length;
		// ��� ���ϴ� �� (���)
		
		System.out.println(" ���� : " + sum);
		System.out.println(" ��� : " + avg);
		
		

	}

}
