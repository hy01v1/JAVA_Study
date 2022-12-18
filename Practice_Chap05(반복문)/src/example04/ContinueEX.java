package example04;

public class ContinueEX {

	public static void main(String[] args) {
		
		// 1~100 까지의 숫자중 홀수(짝수)만 출력하는 프로그램 연습
		//  * 1~31로 범위 수정 ; 너무 많다.
		
		System.out.println("홀수만 출력하는 프로그램");
		for (int i=1; i<=31; i++) {
			if ((i%2) == 0) {
			continue; //continue 는 true일 때 외부 증감식으로 바로 이동한다.
		}
			 System.out.println("홀수 : " + i );
		}
		System.out.println("-----------------------");
		
		System.out.println("짝수만 출력하는 프로그램");
		for (int i=1; i<=31; i++) {
			if ((i%2) != 0) {
			continue; //continue 는 true일 때 외부 증감식으로 바로 이동한다.
		}
			 System.out.println("짝수 : " + i );
		}
		System.out.println("-----------------------");
		
		System.out.println("2와 3의 공배수만 출력하는 프로그램");
		for (int i=1; i<=31; i++) {
			if ((i%2) == 0 && (i%3) == 0 ) {
				 System.out.println("2와 3의 공배수 : " + i );
				continue; 
		}
		}
		System.out.println("-----------------------");
		
		
		
		
		
		
		
		
	}

}
