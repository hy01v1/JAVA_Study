package example01;

public class ArrayEX02 {

	public static void main(String[] args) {
		
		
		int sum = 0;		 // 총점 구하기
		double avg = 0.0;	 // 평균 구하기
		
		int[] score = new int[] {100,200,300};
//		int[] score = {100,200,300}; 와 같다. (new int[]는 생략 가능하다.)
//		선언과 동시에 초기화 되었다.
		
		System.out.println("배열의 크기 : " + score.length);
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		// 배열의 각 요소들을 전부 더하는 식 (총점)
		}
		
		avg = sum / score.length;
		// 평균 구하는 식 (평균)
		
		System.out.println(" 총점 : " + sum);
		System.out.println(" 평균 : " + avg);

		System.out.println("--------------------");
		
		int[] score2 ={100,200,30,544,323,2222};
		for(int i=0; i<score2.length; i++) {
			sum += score2[i];
		}
			avg = sum / score2.length;
			System.out.println(" 총점 : " + sum);
			System.out.println(" 평균 : " + avg);
		

	}

}
