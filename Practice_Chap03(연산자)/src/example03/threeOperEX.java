package example03;

import java.util.Scanner;

public class threeOperEX {
	
	public static void main(String[] args) {

		//���׿����� ����
		
		Scanner sc = new Scanner(System.in);
		// ctrl + Shift + O -> �ڵ� import ����
		// import java.util.Scanner; �ݵ�� ���־�� �Ѵ�.
		
		System.out.println("������ �Է� : ");
		int score = sc.nextInt();
		char grade1 = (score >= 90) ? 'A' : 'B';
		System.out.println("����� ���1 : " + grade1);
		// ** char�� �̿��� ���� ������ ���
		// = (���ǽ�) ? "1" : "2";
		
		String grade2 = (score >= 90) ? "A" : "B";
		System.out.println("����� ���2 : " + grade2);
		// ** ����� ��� 2 => ���׿����� stringType ��ȯ
		
		//grade2 = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
		// grade2�� String �̱� ������ '' �� �ƴ� ""�� ����ؾ� �Ѵ�.
		grade2 = (score >= 90) ? "A" : ((score >= 80) ? "B" : "C");
		System.out.println("����� ���3 : " + grade2);
		// ** ����� ��� 3 => ���׿����� ��ø ���
		
		sc.close();
		//close �ʼ� Ȯ��!!
		
	}

}
