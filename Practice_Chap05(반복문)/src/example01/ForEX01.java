package example01;

public class ForEX01 {

	public static void main(String[] args) {


		// for 문 연습!
		
		int sum =0;
		for(int i=1; i<=100; i++)	// Braekpoint 로 한단계씩 확인 가능하다.(Variables, F8 key로 진행)
		// single loop
		// int i=1	-> 초기화 코드( 최초 1번만 실행 )
		// i<=100	-> 조건식 코드(참인 경우만 실행(조건블럭))
		// i++		-> 증감식 코드
		{
			System.out.println("현재 sum 값 : " + sum);
			sum += i;
		}
		System.out.println("1~100까지의 합 : " + sum);
		// 1~100 까지의 합을 구하는 반복문
		
		System.out.println("----------------------------");
		
		
		
		
	}

}
