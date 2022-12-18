package example02;

public class SwichEX {

	public static void main(String[] args) {
		// 

		int score = 88;
		
		switch(score/10){
		// switch ()=> int 이하의 정수값, String 값

//switch(score){
		case 95 :
			System.out.println("95점입니다.");
			break;
			// break 를 지정하지 않으면, 아래의 system.out 을 모두 출력한다.
		case 94 :
			System.out.println("94점입니다.");
			break;
		case 93 :
			System.out.println("93점입니다.");
			break;
//		default :
//			System.out.println("잘못된 값을 입력하였습니다.");
			// (/10)으로 조건을 지정한 경우 코드
		case 10 :
			System.out.println("A등급입니다.");
			break;
			// break 를 지정하지 않으면, 아래의 system.out 을 모두 출력한다.
		case 9 :
			System.out.println("B등급입니다.");
			break;
		case 8 :
			System.out.println("C등급입니다.");
			break;
		default :
			System.out.println("잘못된 값을 입력하였습니다.");

			
			
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
