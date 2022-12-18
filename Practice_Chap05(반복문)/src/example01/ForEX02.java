package example01;

public class ForEX02 {

	public static void main(String[] args) {

		// 누적 합계가 2000이상일 때 i의 값을 출력하시오.
		// single loop "for"문 연습
		
		int sum =0;
		int temp =0;
		for(int i=1; i<=100; i++)
			// 디버깅 -> debug 창이 팝업될 때, 프로그램에 오류가 생겼다.
			//  -> 발생한 문제를 해결 해 가는 과정을 디버깅 이라 한다.
			// Breakpoint(종단점) 로 한단계씩 확인 가능하다.(Variables, F8 key로 진행)

		{
			sum += i;
			if(sum >= 2000) {
				temp  = i;
				System.out.println("누적 합계가 2000이상일 때  sum 값 : " + sum);
				break;

			}}

		System.out.println("----------------------------");
		
		System.out.println("누적 합계가 2000이상일 때 i의 값 : " + temp);
		// 1~100 까지의 합을 구하는 반복문
		
		System.out.println("----------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
