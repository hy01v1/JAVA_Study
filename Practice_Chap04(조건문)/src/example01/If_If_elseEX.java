package example01;

public class If_If_elseEX {

	public static void main(String[] args) {

		// If, If else 구문 연습
		
		
		int score = 90;
		
		// if 구문은 if문의 모든 if문을 참조한다.(비효율적인 코드이다.)
		if(score > 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		if(score > 80) {
			System.out.println("점수가 80보다 큽니다.");
			//System.out.println("등급은 A입니다.");
		}
		if(score > 92) {
			System.out.println("점수가 90보다 큽니다.");
			//System.out.println("등급은 A입니다.");
		}
		
		System.out.println("********************************");
		
		// if-else 구문
		// if-else 구문은 참,거짓(50%)확률 일 때, 사용하는 것이 좋다.(2선택)
		if(score >= 90) {
			System.out.println("90점 이상입니다.");
		}
		else {
			System.out.println("90점 미만입니다.");
		}
		// {}중괄호는 2줄 이상일 때 반드시 필요하다.
		// 1줄의 코드는 중괄호{} 없이도 실행이 된다.
		
		
		
		
	}

}
