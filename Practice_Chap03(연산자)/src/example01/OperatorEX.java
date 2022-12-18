package example01;

public class OperatorEX {

	public static void main(String[] args) {

		int v1 = 5;
		int v2 = 2;
		
		int result = v1 + v2;
		System.out.println("더하기 결과 = " + result);
		 
		result = v1 - v2;
		System.out.println("빼기 결과 = " + result);
		
		result = v1 * v2;
		System.out.println("곱하기 결과 = " + result);
		
		result = v1 / v2;
		System.out.println("나누기 결과 = " + result);
		
		result = v1 % v2;
		System.out.println("나머지 결과 = " + result);
		// %는 나머지를 구하는 연산자
		
		//result = v1 / 0;
		//System.out.println("0으로 나눈 값 = " + result);
		// 0은 나누면 안된다 ; 산술 연산 예외가 발생한다.
		
		try {
				result = v1 / 0;
		}catch (Exception e) {
		System.out.println("예외발생 = " +  e.toString());
		// 산술연산예외 처리 방법
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
