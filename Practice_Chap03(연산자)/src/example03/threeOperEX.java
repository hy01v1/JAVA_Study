package example03;

import java.util.Scanner;

public class threeOperEX {
	
	public static void main(String[] args) {

		//삼항연산자 연습
		
		Scanner sc = new Scanner(System.in);
		// ctrl + Shift + O -> 자동 import 생성
		// import java.util.Scanner; 반드시 해주어야 한다.
		
		System.out.println("점수를 입력 : ");
		int score = sc.nextInt();
		char grade1 = (score >= 90) ? 'A' : 'B';
		System.out.println("당신의 등급1 : " + grade1);
		// ** char을 이용한 삼항 연산자 사용
		// = (조건식) ? "1" : "2";
		
		String grade2 = (score >= 90) ? "A" : "B";
		System.out.println("당신의 등급2 : " + grade2);
		// ** 당신의 등급 2 => 삼항연산자 stringType 변환
		
		//grade2 = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
		// grade2가 String 이기 때문에 '' 가 아닌 ""를 사용해야 한다.
		grade2 = (score >= 90) ? "A" : ((score >= 80) ? "B" : "C");
		System.out.println("당신의 등급3 : " + grade2);
		// ** 당신의 등급 3 => 삼항연산자 중첩 사용
		
		sc.close();
		//close 필수 확인!!
		
	}

}
