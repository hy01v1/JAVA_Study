package example03;

public class StringEqulalsEX {

	public static void main(String[] args) {

		
		// ������ Ÿ���� ==, != �� ���Ͽ� ����

		String str1 = "�Ͽ�1";
		String str2 = "�Ͽ�1";

		String str3 = new String("�Ͽ�1");
		//new String -> new �����ڸ� ����ϸ� ���ο� �ν��Ͻ�(Ŭ������ ���ϴ� ������ ��ü)�� �����ȴ�.
		String str4 = "�Ͽ���3";
		//���ͷ�(literal)�̶� �ҽ� �ڵ��� ������ ���� ��ǥ�ϴ� ���
		// ���ͷ��� ��� �޸𸮰���(heap)�� '���� ����'�ִ��� Ȯ�� �� '���� �ּ�'�� �����Ѵ�.
		// �и��� �ʿ��� ��� new �����ڷ� ���ο� �ν��Ͻ��� �����Ѵ�.
		
		
		boolean result = (str1 == str2);
		System.out.println(result);
		System.out.println("  => '==' 1, 2 ��°�� (�ּҰ� ����)");
		// ������ Ÿ�Կ��� == �����ڴ� '�ּҺ�'�� �Ѵ�.
		// ���� ���ͷ��� ��� ������ �����Ѵ�.
		boolean result2 = (str3 == str4);
		System.out.println(result2);
		System.out.println("  => '==' 3, 4 ��°�� (�ּҰ� �ٸ���.)");
		
		boolean result3 = (str1 == str3);
		System.out.println(result3);
		System.out.println("  => '==' 1, 3 ��°�� (�ּҰ� �ٸ���.)");
		
		boolean result4 = str1.equals(str4);
		System.out.println(result4);
		System.out.println("  => 'equals' false 1, 4 ��°��");
		boolean result5 = str1.equals(str3);
		System.out.println(result5);
		System.out.println("  => 'equals' true 1, 3 ��°��(new String_�ּҰ� �ٸ���.)");
		// String  Ŭ������ equals()�� �ּҿ� ������� '��'�� ���� ��� true�� ����Ѵ�.
		
		
		
		
		
	}

}
