package example01;

public class VarEx03 {

	public static void main(String[] args) {
		
		byte b1 = 127;
		//byte b2 = b1 + 2;
		byte b2 = (byte)(b1 + 2);
				
		System.out.println(b1);
		System.out.println("오버플로우 = " + b2);
		// byte 사이즈는 127이 한계, 128이상 부터는 오버플로우 발생
		
		int i1 = b1;
		System.out.println("지동케스팅 = " + b1);
		System.out.println("지동케스팅 = " + i1);
		
		
		byte b3 = 127;
		int i2 = 400;
		b3 = (byte)i2;
		// 큰 바이트 -> 작은 바이트 = 손실 발생 (b3)
		System.out.println(b3);
		
		int i3 = 100;
		float f1 = (float)i3;
		System.out.println("정수 -> 실수 = " +  f1);
		
		int i4 = (int)f1;
		System.out.println(i4);
		
		char ch = 'a';
		int i5 = ch;
		System.out.println("문자 -> 정수 = " + i5);
		// 문자를 정수타입(ex, int)으로 바꾸게 되면 아스키코드 값으로 출력이 된다.
		
		int i6 = 123;
		String str = "자바" + i6;
		System.out.println("문자열 타입 변환 + " + str);
		// any type + "" = 문자열 타입 자동 전환
		
		
		
	}

}
