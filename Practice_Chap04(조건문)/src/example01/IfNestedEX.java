package example01;

import java.util.Scanner;

public class IfNestedEX {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		//Scanner는 Resource 이기 때문에 닫아야 한다. => sc.close();
		// ctrl + shift + O => util 작성 명령어
		
		System.out.print("점수를 입력하세요.");
		int score = sc.nextInt();
		//정수를 받을 때 nextInt를 사용한다.
		
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("당신은 A+ 등급입니다.");
			}
			else {
				System.out.println("당신은 A0 등급입니다.");
			}
		}
		else if (score >= 80) {
				if (score >= 85) {
					System.out.println("당신은  B+ 등급입니다.");
				}
				else {
					System.out.println("당신은 B0 등급입니다.");
				}
		}
		// 중괄호{}사용 주의!!
		// 중첩 if문은 무제한으로 사용이 가능하다. 가독성이 좋지 않아 2개 이상은 사용하지 않는다.
		
		sc.close();
		
		
		
		
	}
}
