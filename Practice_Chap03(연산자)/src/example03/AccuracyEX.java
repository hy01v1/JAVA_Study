package example03;

public class AccuracyEX {

	public static void main(String[] args) {

		
		// CPU 정확도 확인

		int apple = 1;
		double unit = 0.1;
		int number = 6;
		
		double result = apple - (number * unit);
		double result2 = (number * unit);
		System.out.println(result2);
		// CPU오차 정보
		System.out.println("사과 한개에서 ");
		System.out.println("0.7조각을 빼면, ");
		System.out.println(result + " 조각이 남는다.");
		
		
		
		
		
		
		
	}

}
