package example02;

import java.util.Scanner;

public class InputGugudanEX {
	
	
	// �Է� ������ ����!!
	public static void main(String[] args) {

		System.out.println("�������� ����մϴ�.");

		try (Scanner sc1 = new Scanner(System.in)) {
			System.out.print("���� ���� �Է��ϼ���. :");
			int start = sc1.nextInt();
			System.out.print("�� ���� �Է��ϼ���. :");
			int end = sc1.nextInt();
			sc1.close();

			for(; start<=end ; start++) {
				for(int j=1; j<10; j++) {
					System.out.println("***** " + start + "�� *****");
					System.out.println(start + "*" + j + "="+ (start*j));
					
				}
			}
		
		}
		
	}
}
