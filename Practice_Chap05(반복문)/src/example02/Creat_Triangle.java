package example02;

public class Creat_Triangle {

	public static void main(String[] args) {

		// 트라이앵글 찍기 연습
		
//		********
//		*******
//		******
//		*****
//		****
//		***
//		**
//		*
		
		int x = 0;
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<(8-x); j++) {
				System.out.print("*");
			}
			x++;
			
		System.out.println();
			
		}

		
System.out.println("---------------------");		
				
		for(int i1=0; i1<8; i1++) {
			for(int j1=i1; j1<8; j1++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}		
}
