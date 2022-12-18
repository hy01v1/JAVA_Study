package example02;

public class SwitchStringEX {

	public static void main(String[] args) {
		
		String str = "과장";
		//문자열이 조건으로 지정된 경우
		
		switch(str){
			case "부장":
				System.out.println("450 만원");
				break;
			case "차장":
				System.out.println("350 만원");
				break;
			case "과장":
				System.out.println("250 만원");
				break;
			case "대리":
				System.out.println("150 만원");
				break;
		default:
			System.out.println("없는 직급입니다.");
			
		
		
		
		
		}
		
		
		
		
		
		
		
		
	}

}
