package example01;

public class ArrayEX00 {

	public static void main(String[] args) {
				
		// 배열 연습

		int[] arr1 = new int[3];
		// -> 4*3=12bite 생성 후 0으로 초기화
		int[] arr2 = new int[] {1,2,3};
		// -> 4*3=12bite 생성 후 1,2,3 값으로 초기화
		
		int[] arr3 = null;
//		arr3 = {1,2,3};
		// new 연산자로 영역을 설정하지 않아서 초기화 문법 애러 발생
		arr3 = new int[] {4,5,6};
		// new 연산자로 영역 설정하고, 4,5,6값으로 초기화
	
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		
	}

}
