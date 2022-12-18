package example04;

import java.util.Scanner;

public class DoWhileEX {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 입력하세요.");
		System.out.println(" q를 입력 하시면 프로그램이 종료됩니다.");
		String str = null;
		
		do {
			// do while 문은 조건문이 뒷부분에 있으므로, 최소 한번 이상 실행을 한다.
			System.out.println(">");
			str = sc.nextLine();
			// string 클레스의 next 메서드는 " :스페이스"전 까지 입력을 받는다. 단어입력
			// string 클레스의 nextLine 메서드는 라인 단위로 입력을 받는다. 
			System.out.println("입력받은 메세지 : " + str);
			
		}while(!str.equals("q"));
			// !(부정연산자)를 입력하지 않는 경우 논리 값이 true가 되어 종료되지 않는다.
		System.out.println("프로그램 종료");
		
		sc.close();
		
		
		
		
		
		
	}

}
