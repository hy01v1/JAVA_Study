package example03;

public class MethodEX {

	public static int add(int x1, int y1) {
	// 메서드의 선언부 구성요소(메서드 = 함수)
		// 1. 리턴 타입(반환값) = int
		// 2. 메서드명(이름) = add
		// 3. () = 매게변수, 인자값, Arguments
		// 메서드 선언부(중요도 매우높다.), 메서드 구현부(정의부)

		int temp = 0;
		temp = x1 + y1;
		return temp;
		// 메서드 구현부
	}
	
		public static int minus(int x2, int y2, int z2) {
		int temp2 = 0;
		temp2 = x2 - y2 -z2;
		return temp2;
		}
		// 연습!!

		public static int add2(int x3, int y3) {
		int temp2 = 0;
		temp2 = x3 - y3;
		return temp2;
		}
		// 연습!!

		
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 30;
		
//		int result = num1 + num2 ;
//		System.out.println(result); 
//		 => num1 + num2
				
		int result = MethodEX.add(num1,num2);
		 // call by value ; 값에 의한 복사
			//  = MethodEX.add(num1,num2); ,  !=MethodEX.add(num1 + num2);
		System.out.println(result);

		System.out.println("연습!!");
		
		
		int num3 = 55;
		int num4 = 41;
		int num5 = 10;
		int result2 = MethodEX.minus(num3, num4, num5);
		
		System.out.println(result2);
		

		System.out.println("연습!!");
		
		int num6 = 74;
		int num7 = 45;
		int result3 = MethodEX.add2(num6, num7 + 365);
		System.out.println(result3);
		
		
		
		
		
		
		
		
	}

}
