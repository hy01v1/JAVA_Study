package example01;

public class IncreDreXEX {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
					
		System.out.println("---------------------------------------");
		System.out.println("x = " + (x++));
		// 후위증가 연산
		System.out.println("x = " + x);
		System.out.println("y = " + (++y));
		System.out.println("y = " + y);
		// 전위증가 연산
		System.out.println("---------------------------------------");
		
		System.out.println(" (x++) + (++y) = " + (x++) + (++y));
		// 연산자를 풀어둔 경우 (문자열 + 문자열)
		System.out.println(" (x++) + (++y) = " + ((x++) + (++y)));
		// 연산자를 묶어준 경우 (수 + 수)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
