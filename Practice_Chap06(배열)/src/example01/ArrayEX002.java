package example01;

import java.util.Arrays;

public class ArrayEX002 {

	public static void main(String[] args) {

//		System.arraycopy(original, 0, cloned, 0, original.length);
//		copyOF()
//		copyOfRange()
	// -> �迭 ���翡 ���� ���� �̿�Ǵ� ��ɾ�	
		int[] original = new int [] {1,2,3,4,5,6,7,8,9};

		for(int i=0; i<original.length; i++) {
		System.out.print(original[i]);}				System.out.println();
			// �迭�� ���� ���
		
		int[] cloned = new int [10];
		for(int i=0; i<original.length; i++) {
			// original�� ���� cloned�� �����Ѵ�.

			cloned[i] = original[i];
		}
		for(int i=0; i<cloned.length; i++) {
		System.out.print(cloned[i]);}				System.out.println();
		
		// 2���� �迭 �⺻ ����
		int[][] score = new int[5][4];
 
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				
				score[i][j] = (int)(Math.random()*2)+1;
				score[i][j] = 10;
				// score[i][j] = 10; => �ڵ�� �޸� ������ �Ҵ�Ǿ��ִ� ���� �����Ͽ� ��� 10���� �����ϰ��ִ� �ڵ��̴�.
				// 2���� �迭������ score�� �ּҰ��̸� score[i]���� �ּҰ��̴�.
			}
		}
		System.out.println(Arrays.toString(score));				System.out.println();

		System.out.println(score);
	
	}

}
