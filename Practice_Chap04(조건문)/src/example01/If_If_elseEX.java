package example01;

public class If_If_elseEX {

	public static void main(String[] args) {

		// If, If else ���� ����
		
		
		int score = 90;
		
		// if ������ if���� ��� if���� �����Ѵ�.(��ȿ������ �ڵ��̴�.)
		if(score > 90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A�Դϴ�.");
		}
		if(score > 80) {
			System.out.println("������ 80���� Ů�ϴ�.");
			//System.out.println("����� A�Դϴ�.");
		}
		if(score > 92) {
			System.out.println("������ 90���� Ů�ϴ�.");
			//System.out.println("����� A�Դϴ�.");
		}
		
		System.out.println("********************************");
		
		// if-else ����
		// if-else ������ ��,����(50%)Ȯ�� �� ��, ����ϴ� ���� ����.(2����)
		if(score >= 90) {
			System.out.println("90�� �̻��Դϴ�.");
		}
		else {
			System.out.println("90�� �̸��Դϴ�.");
		}
		// {}�߰�ȣ�� 2�� �̻��� �� �ݵ�� �ʿ��ϴ�.
		// 1���� �ڵ�� �߰�ȣ{} ���̵� ������ �ȴ�.
		
		
		
		
	}

}
