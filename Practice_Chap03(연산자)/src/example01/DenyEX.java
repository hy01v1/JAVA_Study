package example01;

public class DenyEX {

	public static void main(String[] args) {

		//�� ���� ������ ����
		boolean power = false;
		System.out.println("power�� �� = " + power);
		
		power = !power;
		System.out.println(power);
		power = !power;
		System.out.println(power);
		power = !power;
		System.out.println(power);

		// (!) ������������ => not ������(�ݴ밪�� ���Ѵ�.)
		
		if(!power) {
			System.out.println("if�� ����� = false");
		}

		if(power) {
			System.out.println("if�� ����� =  true");
		}
		
				
	}

}
