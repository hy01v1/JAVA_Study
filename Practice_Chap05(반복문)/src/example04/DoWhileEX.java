package example04;

import java.util.Scanner;

public class DoWhileEX {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println(" �Է��ϼ���.");
		System.out.println(" q�� �Է� �Ͻø� ���α׷��� ����˴ϴ�.");
		String str = null;
		
		do {
			// do while ���� ���ǹ��� �޺κп� �����Ƿ�, �ּ� �ѹ� �̻� ������ �Ѵ�.
			System.out.println(">");
			str = sc.nextLine();
			// string Ŭ������ next �޼���� " :�����̽�"�� ���� �Է��� �޴´�. �ܾ��Է�
			// string Ŭ������ nextLine �޼���� ���� ������ �Է��� �޴´�. 
			System.out.println("�Է¹��� �޼��� : " + str);
			
		}while(!str.equals("q"));
			// !(����������)�� �Է����� �ʴ� ��� �� ���� true�� �Ǿ� ������� �ʴ´�.
		System.out.println("���α׷� ����");
		
		sc.close();
		
		
		
		
		
		
	}

}
