package example02;

public class SwitchNestedEX {

	public static void main(String[] args) {

		// switch 중첩, if 중첩 혼합 연습
		// 정형화된 값에는 switch문이(if문에 비하여) 가독성이 좋다.
		
		int number = 5;

		switch (number) {
		case 1 :
		case 7 :
			switch (number) {
			case 1:
				System.out.println("011 입니다.");
				break;
			case 7:
				System.out.println("017 입니다.");
				break;
			}
			break;
			//  중첩 switch 문 활용

		case 6 :
		case 9 :
			if (number == 6) {	//switch (number) {
				System.out.println("016 입니다.");}	//case 6:
													//System.out.println("016 입니다.");
													//break;
				else if (number == 9) {
					System.out.println("019 입니다.");}
//				case 9:
//				System.out.println("019 입니다.");
//				break;
			break;
			//  => 중첩 switch 문 if문으로 수정
			
			default :
	System.out.println("없는 번호입니다.");
	
	
	
		}}}