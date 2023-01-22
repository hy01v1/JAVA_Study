package example01;

public class ArrayEX01 {

	public static void main(String[] args) {
		
		// 배열 연습
		
		int [] score = null;
		// 'score'는 int[](배열타입의)참조 변수이다.
//		score = { 100, 330 }
		// 문법 애러 => new(연산자)문으로 heap영역에 방을 만들어야 한다.
		score = new int[5];
		// score 는 5개의 방을 heap에 생성하고 있다.(20bite)
		
		
		System.out.println("score 의 주소값 : " + score);
		// 배열명(score) = 주소이다.
		
		for(int i=0; i<score.length; i++) {
			//참조변수.length => score변수의 수[] 만큼 자동으로입력된다.
			System.out.println("score[" + i + "] =" + score[i]);
		}
		
		System.out.println("-------------------------");

		score[0] = 100;
		// => score[x]는 변수와 동일하다.( []안에 들어가는 숫자를 인덱스, 첨자 라고 한다.)
		for(int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "] =" + score[i]);
		}

		System.out.println("-------------------------");

		score[0] = 200;
		for(int i=0; i<score.length; i++) {
		System.out.println("score[" + i + "] =" + score[i]);
		}
		
		System.out.println("-------------------------");
		
		for(int i=0; i<score.length; i++) {
			score [i] = i + 10; 
			System.out.println("score[" + i + "] =" + score[i]);
		}

		System.out.println("-------------------------");
		
		for(int i=0; i<score.length; i++) {
			score [i] = i + 30; 
			System.out.println("score[" + i + "] =" + score[i]);
		}
		
		
	}

}
