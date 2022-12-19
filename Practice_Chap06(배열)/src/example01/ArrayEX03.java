package example01;

import java.util.Arrays;

public class ArrayEX03 {

	public static void main(String[] args) {

		// 복습 필요
		
		int[] arr1 = new int [10];
		// 40bite 가 heap에 생성되었다.
		char[] chArr = new char[] { 'a', 'b', 'c'};
		// 6bite 가 heap에 생성되었다.
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = (int)(Math.random()*10)+1;
			// 범위 : 1~10 까지 의 난수를 대입
		}
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
			// 배열의 값을 출력
		}
		System.out.println();
		System.out.println("------------------------------");

		for(int i=0; i<arr1.length; i++) {
			if(i == 9) {
				System.out.print(arr1[i]);
			}
			else {
				System.out.print(arr1[i] + ", ");
				// 배열의 값을 보기 좋게 출력
			}
		}
			System.out.println();
			System.out.println(Arrays.toString(arr1));
			// Arrays 클레스는 배열을 조작하기 쉽게 만들어 놓은 유틸리티 클레스이다.
			System.out.println(Arrays.toString(chArr));
		
		System.out.println(arr1);	//int 타입이 출력된다. 출력시 참조변수명.toString()호출이 자동으로 입력된다.
		System.out.println(arr1.toString());	//int 타입이 출력된다. 출력시 참조변수명.toString()호출이 자동으로 입력된다.
		System.out.println(chArr);	//char 타입이 출력된다. 유니코드 때문
		System.out.println(chArr.toString());	//char 타입의 주소가 출력된다.(toString())메서드를 호출해야 출력이 된다.
		//주소값 출력 방법(출력 스트림에 메서드를 활용해야 주소가 출력된다.)
		
	}

}
