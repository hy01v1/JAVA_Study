package example03;

public class MethodEX {

	public static int add(int x1, int y1) {
	// �޼����� ����� �������(�޼��� = �Լ�)
		// 1. ���� Ÿ��(��ȯ��) = int
		// 2. �޼����(�̸�) = add
		// 3. () = �ŰԺ���, ���ڰ�, Arguments
		// �޼��� �����(�߿䵵 �ſ����.), �޼��� ������(���Ǻ�)

		int temp = 0;
		temp = x1 + y1;
		return temp;
		// �޼��� ������
	}
	
		public static int minus(int x2, int y2, int z2) {
		int temp2 = 0;
		temp2 = x2 - y2 -z2;
		return temp2;
		}
		// ����!!

		public static int add2(int x3, int y3) {
		int temp2 = 0;
		temp2 = x3 - y3;
		return temp2;
		}
		// ����!!

		
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 30;
		
//		int result = num1 + num2 ;
//		System.out.println(result); 
//		 => num1 + num2
				
		int result = MethodEX.add(num1,num2);
		 // call by value ; ���� ���� ����
			//  = MethodEX.add(num1,num2); ,  !=MethodEX.add(num1 + num2);
		System.out.println(result);

		System.out.println("����!!");
		
		
		int num3 = 55;
		int num4 = 41;
		int num5 = 10;
		int result2 = MethodEX.minus(num3, num4, num5);
		
		System.out.println(result2);
		

		System.out.println("����!!");
		
		int num6 = 74;
		int num7 = 45;
		int result3 = MethodEX.add2(num6, num7 + 365);
		System.out.println(result3);
		
		
		
		
		
		
		
		
	}

}
