package example03;

public class WhileEX01 {

	public static void main(String[] args) {
		// While 문 연습
		
		int sum = 0;
		int i =  1;
		
		// while 문은 초기화 하는 부분이 없다.
		// while 문은 조건식만 기입하기 때문에 for문에(일반적루핑에서) 비해 가독성이 떨어진다.
		while(i<100) {
			sum += i;
			i++;
		}
		System.out.println("1~100 까지의 합 : " + sum);
		
		System.out.println("------------------------");
		// C언어 에서는 boolean타입이 없다. => 0을 제외한 모든 값은 참(true)으로 인식한다.
		//  * while 문은 무한 루프 용도로 많이 사용한다.
		//  * 무한 루프를 빠져 나올 수 있는 if(조건) break; 를 사용하는 것을 권장한다.
		int i2 = 1;
		while (true) {
			if (i2>=100) {
				break;
			}
		i2++;
		System.out.println(i2);
	}
		
		
		
	}
}
