package example03;

public class RandomEX {

	public static void main(String[] args) {

		// if문의 Math.random() 메서드 사용 연습

		System.out.println(Math.random());
		//Math random 의 값은 0.00000~0, 0.99999~9 사이의 값을 출력한다.
		
		int num = (int)(Math.random()*6)+1;
		// 1 ~ 6 까지의 랜덤숫자 출력식
		System.out.println(num);
		
		if (num == 1) {
			System.out.println("출력 번호 : 1");
		}
		else if (num == 2) {
			System.out.println("출력 번호 : 2");
		}
		else if (num == 3) {
			System.out.println("출력 번호 : 3");
		}
		else if (num == 4) {
			System.out.println("출력 번호 : 4");
		}
		else if (num == 5) {
			System.out.println("출력 번호 : 5");
		}
		else {
			System.out.println("출력 번호 : 6");
		}
		// switch 문으로 변경 가능한 if 문 이다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
