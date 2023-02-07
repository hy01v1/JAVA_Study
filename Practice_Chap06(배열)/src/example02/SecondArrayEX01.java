package example02;

public class SecondArrayEX01 {

	public static void main(String[] args) {
		
		// ���� for�� (JDK 1.5)

		int[][] score = new int[][] {
			// [] ���ȣ�� ������ �� ������ �ǹ��Ѵ�.
			// 2���� �迭�� ����� ���ÿ� �ʱ�ȭ�� �ϰ��ִ�.

			{100,100,100},
			{50,50,50},
			{10,20,30},
			{40,50,60}
		};
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.println(score[i][j]);

				// 2���� �迭�� ���� �а�, ���� ���ؼ��� �ݵ�� ��������� �ʿ��ϴ�.
			}
		}
		
		System.out.println("2���� �迭�� ũ�� : "+score.length);
		System.out.println("2���� �迭�� �ּ� : "+score);

		// 2���� �迭������ 2���� �迭�� �ּ�, 1���� �迭�� �ּҰ� �ȴ�.
		
		for(int i=0; i<score.length; i++) {
			System.out.println("1���� �迭�� ũ�� : "+score[i].length);
			System.out.println("1���� �迭�� �ּ� : "+score[i]);
		}
		
		score[0][0] = 999;
		// 2���� �迭������ �迭��[][]�� �� ������ �����ϴ�.
		System.out.println(score[0][0]);
		
		// ���� for�� (JDK 1.5)
		// collection framework ��ü�� ���� �� ��, ���� ���Ǵ� ���
		// for�� ( ������ Ÿ�� : ������ ��� )
		int sum = 0;
		for ( int[] temp : score) {
			for ( int i : temp) {
				sum += i;
			}
		}
		System.out.println(" �հ� : " + sum);
		
	}
}
