package example03;

import java.util.Scanner;

public class WhileEX02 {

	public static void main(String[] args) {

		// while 문으로 무한루프, flag 변수 사용 연습
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;	// flag 변수
		int speed = 0;
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1. 증속 |2. 감속 |3. 중지"); 
			System.out.println("-----------------------");
			System.out.println("속도입력 : ");
			int choice = sc.nextInt();
			
			
			if (choice == 1){
				speed++;
				System.out.println("현재 속도 : " + speed);
			}
			else if (choice == 2){
				speed--;
				System.out.println("현재 속도 : " + speed);
			}
			else if (choice == 3){
				System.out.println("현재 속도 : " + speed);
				System.out.println("프로그램을 종료합니다.");
				break;
				}
			else {
				System.out.println("현재 속도 : " + speed);
				System.out.println(" 잘못된 입력입니다. ");

			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
