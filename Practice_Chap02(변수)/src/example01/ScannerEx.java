package example01;


import java.util.Scanner;
// �ڹ� ��ƿ�� �ҷ����� ��ɾ�

public class ScannerEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Ctrl + Shift + O = �ڵ� ����Ʈ
		// Scanner Class �� �Է��� �ޱ� ���� Ŭ����
		// �Է½�Ʈ��
//		sc.closs();
		// Resource(�ڿ�)�� ��� �� �ݵ�� �ݾƾ� �Ѵ�.
		
		System.out.println("���� ���ڸ��� �Է� : ");
		int num = sc.nextInt();
		System.out.println("����ڷ� ���� �Է¹��� ���� : " + num);
		
		System.out.println("�Ǽ� ���ڸ��� �Է� : ");
		Double dnum = sc.nextDouble();
		System.out.println("����ڷ� ���� �Է¹��� ���� : " + dnum);
		
		System.out.println("���ڸ� �Է� : ");
		String str1 = sc.next();
		System.out.println("����ڷ� ���� �Է¹��� ���� : " + str1);
		// next()�� ������ �������� �Է��� Ȯ���Ѵ�. ->�ܾ� �Է�
		
		System.out.println("������ �Է� : ");
		String str2 = sc.nextLine();
		System.out.println("����ڷ� ���� �Է¹��� ���� : " + str2);
		// nextLine()�� ���͸� �������� �Է��� Ȯ���Ѵ�. ->���� �Է�
		
		int result = 100;
		String str3 = sc.nextLine();
		
		int temp = Integer.parseInt(str3);
		// Integer.parseInt(); �޼��� -> ���ڷ� ���� �Է°��� ����Ÿ������ ��ȯ ���
		int total = result + temp;
		System.out.println("������ : " + total);
		
		sc.close();
		// close �ݵ�� Ȯ��
		
	}

}
