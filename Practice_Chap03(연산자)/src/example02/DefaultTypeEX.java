package example02;

public class DefaultTypeEX {

	public static void main(String[] args) {

		byte b1 = 127;
		byte b2 = 1;
		char ch = 'A';
		float f1 = 15.5f;
		Double d1 = 10.5;
		
		
	//	byte b3 = b1 + b2;
		// -> 케스팅 문제; 문자열로 인식되어 int(default)로 인식된다. 해결 ->
		int i1 = b1 + b2; // =(같은방법) -> byte i1 = (byte)(b1 + b2);
		byte b4 = (byte)(b1 + b2);
		System.out.println(i1);
		System.out.println(b4);
		// =
		System.out.println(i1 + " , " + b4);
		System.out.println("----------------------------");
		int i2 = ch + b2;
		System.out.println(i2); // 65 + 1
		System.out.println(i2 + f1); // 65 + 15.5
		System.out.println("----------------------------");
		
		// b1(=byteType) + f1(=floatType) = f2(floatType)
		// f1(=floatType) + d1(=doubleType) = d2(doubleType)
		float f2 = b1 + f1;
		System.out.println(f2);
		Double d2 = f1 + d1;
		System.out.println(d2);
		System.out.println("----------------------------");

		// f2(=floatType) + d2(=doubleType) = 값(doubleType)
		System.out.println(f2 + d2);
		
		
		
	}

} 
