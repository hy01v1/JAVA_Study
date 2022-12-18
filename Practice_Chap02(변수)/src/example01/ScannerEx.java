package example01;


import java.util.Scanner;
// 자바 유틸을 불러오는 명령어

public class ScannerEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Ctrl + Shift + O = 자동 임포트
		// Scanner Class 는 입력을 받기 위한 클래스
		// 입력스트림
//		sc.closs();
		// Resource(자원)는 사용 후 반드시 닫아야 한다.
		
		System.out.println("정수 한자리를 입력 : ");
		int num = sc.nextInt();
		System.out.println("사용자로 부터 입력받은 숫자 : " + num);
		
		System.out.println("실수 한자리를 입력 : ");
		Double dnum = sc.nextDouble();
		System.out.println("사용자로 부터 입력받은 숫자 : " + dnum);
		
		System.out.println("문자를 입력 : ");
		String str1 = sc.next();
		System.out.println("사용자로 부터 입력받은 문자 : " + str1);
		// next()는 공백을 기준으로 입력을 확인한다. ->단어 입력
		
		System.out.println("문장을 입력 : ");
		String str2 = sc.nextLine();
		System.out.println("사용자로 부터 입력받은 문장 : " + str2);
		// nextLine()은 엔터를 기준으로 입력을 확인한다. ->문장 입력
		
		int result = 100;
		String str3 = sc.nextLine();
		
		int temp = Integer.parseInt(str3);
		// Integer.parseInt(); 메서드 -> 문자로 받은 입력값을 숫자타입으로 변환 기능
		int total = result + temp;
		System.out.println("연산결과 : " + total);
		
		sc.close();
		// close 반드시 확인
		
	}

}
