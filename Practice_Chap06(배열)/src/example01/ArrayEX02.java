package example01;

public class ArrayEX02 {

	public static void main(String[] args) {
		
		
		int sum = 0;		 // ���� ���ϱ�
		double avg = 0.0;	 // ��� ���ϱ�
		
		int[] score = new int[] {100,200,300};
//		int[] score = {100,200,300}; �� ����. (new int[]�� ���� �����ϴ�.)
//		����� ���ÿ� �ʱ�ȭ �Ǿ���.
		
		System.out.println("�迭�� ũ�� : " + score.length);
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		// �迭�� �� ��ҵ��� ���� ���ϴ� �� (����)
		}
		
		avg = sum / score.length;
		// ��� ���ϴ� �� (���)
		
		System.out.println(" ���� : " + sum);
		System.out.println(" ��� : " + avg);

		System.out.println("--------------------");
		
		int[] score2 ={100,200,30,544,323,2222};
		for(int i=0; i<score2.length; i++) {
			sum += score2[i];
		}
			avg = sum / score2.length;
			System.out.println(" ���� : " + sum);
			System.out.println(" ��� : " + avg);
		

	}

}
