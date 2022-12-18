package example03;

public class LogicalOperEX {

	public static void main(String[] args) {

		// 논리연산자 (&&, ||) 연습
		
		boolean result0 = false;
		int i0 = 11;
		boolean result1 = false;
		int i1 = 22;
		boolean result2 = false;
		int i2 = 71;

		boolean result3 = false;
		char ch1 = 'b';
		boolean result4 = false;
		char ch2 = 'C';
		
		//??  result5 의 값이 다르다 ??
		boolean r5 = false;
		int i3 = 13;
		
		
		result0 = (i0 > 5);
		System.out.println("0. (i > 5) : " + result0);
		System.out.println("  =>5보다 큰 int값" + "**" +  i0 + "**");
		result1 = (i1 >= 9) && (i1 < -8);
		System.out.println("1. result = (i >= 9) && (i < -8); : " + result1);
		System.out.println("  =>9이상 이면서, -8보다 작은 int값" + "**" + i1 + "**");
		result2 = (i2 >= 9) || (i2 < -8);
		System.out.println("2. result = (i >= 9) || (i < -8); : " + result2);
		System.out.println("  =>9이상 이거나, -8보다 작은 int값" + "**" + i2 + "**");

	//아스키코드값의 범위로 계산이 된다.	
		
		result3 = (ch1 > 'a' && ch1 <= 'z');
		System.out.println("3. (ch1 > 'a' && ch1 <= 'z'); : " + result3);
		System.out.println("  =>ch1 에 저장된 변수가 소문자인지 확인하는 식"+ "**" + ch1 + "**");
		// ch1 에 저장된 변수가 소문자인지 확인하는 식
		
		result4 = (ch2 > 'a' && ch2 <= 'z') || (ch2 > 'A' && ch2 <= 'Z');
		System.out.println("4. (ch2 > 'a' && ch2 <= 'z') || (ch > 'A' && ch <= 'Z'); : " + result4);
		System.out.println("  =>ch2 에 저장된 변수가 알파벳인지 확인하는 식"+ "**" + ch2 + "**");
		// ch2 에 저장된 변수가 알파벳인지 확인하는 식
		
		r5 = (i3 > 0 && i3 <= 9);
		// 주의!! '', "", () 사용 확인필수
		System.out.println("5. (i3 > '0' && i3 <= '9'); :" + r5);
		System.out.println("  =>i3 에 저장된 변수가 한자리 자연수인지 확인하는 식"+ "**" + i3 + "**");
		// i3 에 저장된 변수가 한자리 자연수인지 확인하는 식
		
		
		
		
		
		
		
		
		
		
	}

}
