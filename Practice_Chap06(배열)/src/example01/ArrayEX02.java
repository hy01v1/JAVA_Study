package example01;

public class ArrayEX02 {

	public static void main(String[] args) {
		
		
		int sum = 0; // ÃÑÁ¡
		double avg = 0.0; // Æò±Õ
		
		int[] score = new int[] {100,200,300};
		
		System.out.println("¹è¿­ÀÇ Å©±â : " + score.length);
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		// ¹è¿­ÀÇ °¢ ¿ä¼ÒµéÀ» ÀüºÎ ´õÇÏ´Â ½Ä (ÃÑÁ¡)
		}
		
		avg = sum / score.length;
		// Æò±Õ ±¸ÇÏ´Â ½Ä (Æò±Õ)
		
		System.out.println(" ÃÑÁ¡ : " + sum);
		System.out.println(" Æò±Õ : " + avg);
		
		

	}

}
