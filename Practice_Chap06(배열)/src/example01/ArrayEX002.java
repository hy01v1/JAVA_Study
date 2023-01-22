package example01;

import java.util.Arrays;

public class ArrayEX002 {

	public static void main(String[] args) {

//		System.arraycopy(original, 0, cloned, 0, original.length);
//		copyOF()
//		copyOfRange()
	// -> 배열 복사에 가장 많이 이용되는 명령어	
		int[] original = new int [] {1,2,3,4,5,6,7,8,9};

		for(int i=0; i<original.length; i++) {
		System.out.print(original[i]);}				System.out.println();
			// 배열의 값을 출력
		
		int[] cloned = new int [10];
		for(int i=0; i<original.length; i++) {
			// original의 값을 cloned로 대입한다.

			cloned[i] = original[i];
		}
		for(int i=0; i<cloned.length; i++) {
		System.out.print(cloned[i]);}				System.out.println();
		
		// 2차원 배열 기본 설명
		int[][] score = new int[5][4];
 
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				
				score[i][j] = (int)(Math.random()*2)+1;
				score[i][j] = 10;
				// score[i][j] = 10; => 코드는 메모리 공간에 할당되어있는 값에 접근하여 모두 10으로 대입하고있는 코드이다.
				// 2차원 배열에서는 score도 주소값이며 score[i]값도 주소값이다.
			}
		}
		System.out.println(Arrays.toString(score));				System.out.println();

		System.out.println(score);
	
	}

}
