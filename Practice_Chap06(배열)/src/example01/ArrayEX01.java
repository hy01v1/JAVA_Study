package example01;

public class ArrayEX01 {

	public static void main(String[] args) {
		
		// �迭 ����
		
		int [] score = null;
		// 'score'�� int[](�迭Ÿ����)���� �����̴�.
//		score = { 100, 330 }
		// ���� �ַ� => new(������)������ heap������ ���� ������ �Ѵ�.
		score = new int[5];
		// score �� 5���� ���� heap�� �����ϰ� �ִ�.(20bite)
		
		
		System.out.println("score �� �ּҰ� : " + score);
		// �迭��(score) = �ּ��̴�.
		
		for(int i=0; i<score.length; i++) {
			//��������.length => score������ ��[] ��ŭ �ڵ������Էµȴ�.
			System.out.println("score[" + i + "] =" + score[i]);
		}
		
		System.out.println("-------------------------");

		score[0] = 100;
		// => score[x]�� ������ �����ϴ�.( []�ȿ� ���� ���ڸ� �ε���, ÷�� ��� �Ѵ�.)
		for(int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "] =" + score[i]);
		}

		System.out.println("-------------------------");

		score[0] = 200;
		for(int i=0; i<score.length; i++) {
		System.out.println("score[" + i + "] =" + score[i]);
		}
		
		System.out.println("-------------------------");
		
		for(int i=0; i<score.length; i++) {
			score [i] = i + 10; 
			System.out.println("score[" + i + "] =" + score[i]);
		}

		System.out.println("-------------------------");
		
		for(int i=0; i<score.length; i++) {
			score [i] = i + 30; 
			System.out.println("score[" + i + "] =" + score[i]);
		}
		
		
	}

}
