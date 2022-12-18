package example01;

import java.util.Scanner;

public class IfElseIfElseEX {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		//Scanner는 Resource 이기 때문에 닫아야 한다. => sc.close();
		// ctrl + shift + O => util 작성 명령어
		
		System.out.print("점수를 입력하세요.");
		int score = sc.nextInt();
		//정수를 받을 때 nextInt를 사용한다.

//		int score = 90;
		if(score >= 90) {
			System.out.println("점수가 90~100점 사이입니다.");
			System.out.println("등급은A입니다.");
		}
		else if (score >= 80) {
			System.out.println("점수가 80~89점 사이입니다.");
			System.out.println("등급은 B입니다.");
		}
		else if (score >= 70) {
			System.out.println("점수가 70~79점 사이입니다.");
			System.out.println("등급은 C입니다.");
		}
		else {
			System.out.println("점수가 70점 미만입니다.");
			System.out.println("등급은 D입니다.");
		}
		// if-else if 구문은 결정 된 값 이하의 모든 if문을 참조하지 않는다.(효율적인 코드이다.)
		//   => score 변수의 값에 따라 if조건문에서 분기가 적용된다.
		

		sc.close();
		

		
	}

}
