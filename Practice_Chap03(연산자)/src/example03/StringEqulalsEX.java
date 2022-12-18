package example03;

public class StringEqulalsEX {

	public static void main(String[] args) {

		
		// 참조형 타입의 ==, != 에 대하여 연습

		String str1 = "하영1";
		String str2 = "하영1";

		String str3 = new String("하영1");
		//new String -> new 연산자를 사용하면 새로운 인스턴스(클레스에 속하는 개개의 객체)가 생성된다.
		String str4 = "하영님3";
		//리터럴(literal)이란 소스 코드의 고정된 값을 대표하는 용어
		// 리터럴인 경우 메모리공간(heap)에 '같은 값이'있는지 확인 후 '같은 주소'를 공유한다.
		// 분리가 필요한 경우 new 연산자로 새로운 인스턴스를 생성한다.
		
		
		boolean result = (str1 == str2);
		System.out.println(result);
		System.out.println("  => '==' 1, 2 출력결과 (주소가 같다)");
		// 참조형 타입에서 == 연산자는 '주소비교'를 한다.
		// 같은 리터럴의 경우 번지를 공유한다.
		boolean result2 = (str3 == str4);
		System.out.println(result2);
		System.out.println("  => '==' 3, 4 출력결과 (주소가 다르다.)");
		
		boolean result3 = (str1 == str3);
		System.out.println(result3);
		System.out.println("  => '==' 1, 3 출력결과 (주소가 다르다.)");
		
		boolean result4 = str1.equals(str4);
		System.out.println(result4);
		System.out.println("  => 'equals' false 1, 4 출력결과");
		boolean result5 = str1.equals(str3);
		System.out.println(result5);
		System.out.println("  => 'equals' true 1, 3 출력결과(new String_주소가 다르다.)");
		// String  클레스의 equals()는 주소와 상관없이 '값'이 같은 경우 true를 출력한다.
		
		
		
		
		
	}

}
