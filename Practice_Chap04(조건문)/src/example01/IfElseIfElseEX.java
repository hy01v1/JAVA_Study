package example01;

import java.util.Scanner;

public class IfElseIfElseEX {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		//Scanner�� Resource �̱� ������ �ݾƾ� �Ѵ�. => sc.close();
		// ctrl + shift + O => util �ۼ� ��ɾ�
		
		System.out.print("������ �Է��ϼ���.");
		int score = sc.nextInt();
		//������ ���� �� nextInt�� ����Ѵ�.

//		int score = 90;
		if(score >= 90) {
			System.out.println("������ 90~100�� �����Դϴ�.");
			System.out.println("�����A�Դϴ�.");
		}
		else if (score >= 80) {
			System.out.println("������ 80~89�� �����Դϴ�.");
			System.out.println("����� B�Դϴ�.");
		}
		else if (score >= 70) {
			System.out.println("������ 70~79�� �����Դϴ�.");
			System.out.println("����� C�Դϴ�.");
		}
		else {
			System.out.println("������ 70�� �̸��Դϴ�.");
			System.out.println("����� D�Դϴ�.");
		}
		// if-else if ������ ���� �� �� ������ ��� if���� �������� �ʴ´�.(ȿ������ �ڵ��̴�.)
		//   => score ������ ���� ���� if���ǹ����� �бⰡ ����ȴ�.
		

		sc.close();
		

		
	}

}
