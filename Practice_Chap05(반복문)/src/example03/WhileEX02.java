package example03;

import java.util.Scanner;

public class WhileEX02 {

	public static void main(String[] args) {

		// while ������ ���ѷ���, flag ���� ��� ����
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;	// flag ����
		int speed = 0;
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1. ���� |2. ���� |3. ����"); 
			System.out.println("-----------------------");
			System.out.println("�ӵ��Է� : ");
			int choice = sc.nextInt();
			
			
			if (choice == 1){
				speed++;
				System.out.println("���� �ӵ� : " + speed);
			}
			else if (choice == 2){
				speed--;
				System.out.println("���� �ӵ� : " + speed);
			}
			else if (choice == 3){
				System.out.println("���� �ӵ� : " + speed);
				System.out.println("���α׷��� �����մϴ�.");
				break;
				}
			else {
				System.out.println("���� �ӵ� : " + speed);
				System.out.println(" �߸��� �Է��Դϴ�. ");

			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
