package example01;

public class DenyEX {

	public static void main(String[] args) {

		//논리 부정 연산자 연습
		boolean power = false;
		System.out.println("power의 값 = " + power);
		
		power = !power;
		System.out.println(power);
		power = !power;
		System.out.println(power);
		power = !power;
		System.out.println(power);

		// (!) 논리부정연산자 => not 연산자(반대값을 취한다.)
		
		if(!power) {
			System.out.println("if문 실행됨 = false");
		}

		if(power) {
			System.out.println("if문 실행됨 =  true");
		}
		
				
	}

}
