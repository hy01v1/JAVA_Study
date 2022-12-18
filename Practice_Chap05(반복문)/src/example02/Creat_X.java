package example02;

public class Creat_X {

	public static void main(String[] args) {

		// X 찍기 연습

//		*   *
//		 * *
//		  *
//		 * *
//		*   *
		
		int x = 1;
		int y = 5;
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				
//				System.out.print("*");

				if ( j == x || j == y) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			
			}

			x++;
			y--;
			
			System.out.println();
		}
	}
}
