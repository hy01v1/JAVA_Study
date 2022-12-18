package example02;

import java.util.Scanner;

public class InputGugudanEX {
	
	
	// 입력 구구단 연습!!
	public static void main(String[] args) {

		System.out.println("구구단을 출력합니다.");

		try (Scanner sc1 = new Scanner(System.in)) {
			System.out.print("시작 단을 입력하세요. :");
			int start = sc1.nextInt();
			System.out.print("끝 단을 입력하세요. :");
			int end = sc1.nextInt();
			sc1.close();

			for(; start<=end ; start++) {
				for(int j=1; j<10; j++) {
					System.out.println("***** " + start + "단 *****");
					System.out.println(start + "*" + j + "="+ (start*j));
					
				}
			}
		
		}
		
	}
}
