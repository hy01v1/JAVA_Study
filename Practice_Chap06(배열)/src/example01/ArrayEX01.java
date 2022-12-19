package example01;

public class ArrayEX01 {

	public static void main(String[] args) {
		
		// 배열 연습
		
		int [] score = null;
		// 'score'는 참조 변수이다.
//		score = { 100, 330 }
		// 문법 애러 => new 문으로 heap영역에 방을 만들어야 한다.
		score = new int[5];
		
		System.out.println("score 의 주소값 : " + score);
		// score 는 5개의 방을 heap에 생성하고 있다.
		
		for(int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "] =" + score[i]);
		}
		
		System.out.println("-------------------------");
		
		score[0] = 100;
		// => score[x]는 변수와 동일하다.( []안에 들어가는 숫자를 인덱스, 첨자 라고 한다.)
		for(int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "] =" + score[i]);
		}

		System.out.println("-------------------------");
		
		for(int i=0; i<score.length; i++) {
			score [i] = i + 10; 
			System.out.println("score[" + i + "] =" + score[i]);
		}
		
		
		
		
		
		
		
	}

}
