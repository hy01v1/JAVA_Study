package example02;

public class BitOperatorEX {

	public static void main(String[] args) {

		// 비트 연산자 -> & , | , ^
		
		int x1 = 8;
		int y1 = 5;
		int x2 = -8;
		int y2 = -5;
		
		System.out.println("x를 2진수로 변환 -> " + Integer.toBinaryString(x1));
		System.out.println("x를 2진수로 변환 -> " + Integer.toBinaryString(y1));
		System.out.println("------------------------------");
		
		System.out.println("x를 2진수로 변환 -> " + Integer.toBinaryString(x2));
		System.out.println("x를 2진수로 변환 -> " + Integer.toBinaryString(y2));
		System.out.println("------------------------------");
		
		System.out.println("x와 y를 비트연산 -> &(AND)연산 : " + (x1 & y1));
		System.out.println("x와 y를 비트연산 -> |(OR)연산 : " + (x1 | y1));
		System.out.println("x와 y를 비트연산 -> ^(XOR)연산 : " + (x1 ^ y1));
		System.out.println("------------------------------");

		System.out.println("x와 y를 비트연산 -> &(AND)연산 : " + (x2 & y2));
		System.out.println("x와 y를 비트연산 -> |(OR)연산 : " + (x2 | y2));
		System.out.println("x와 y를 비트연산 -> ^(XOR)연산 : " + (x2 ^ y2));
		System.out.println("------------------------------");

		// AND 연산은 1, 1 일때 1을 출력
		// OR 연산은 1 이 있을때 1을 출력
		// XOR 연산은 서로 다를 때 1을 출력 ( = 배타적논리합_exclusive or)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
