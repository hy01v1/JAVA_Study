package example01;

import java.util.Scanner;

public class IfNestedEX {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		//Scanner�� Resource �̱� ������ �ݾƾ� �Ѵ�. => sc.close();
		// ctrl + shift + O => util �ۼ� ��ɾ�
		
		System.out.print("������ �Է��ϼ���.");
		int score = sc.nextInt();
		//������ ���� �� nextInt�� ����Ѵ�.
		
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("����� A+ ����Դϴ�.");
			}
			else {
				System.out.println("����� A0 ����Դϴ�.");
			}
		}
		else if (score >= 80) {
				if (score >= 85) {
					System.out.println("�����  B+ ����Դϴ�.");
				}
				else {
					System.out.println("����� B0 ����Դϴ�.");
				}
		}
		// �߰�ȣ{}��� ����!!
		// ��ø if���� ���������� ����� �����ϴ�. �������� ���� �ʾ� 2�� �̻��� ������� �ʴ´�.
		
		sc.close();
		
		
		
		
	}
}
