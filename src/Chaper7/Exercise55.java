package Chaper7;

import java.util.*;

//Xoa phan tu tai vi tri le trong mang
public class Exercise55 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arrA = new int[10];
		int[] arrB = new int[5];
		int position = 0;
		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = numbRandom.nextInt(200);
			System.out.print(arrA[i] + ", ");
		}
		for (int i = 0; i < arrA.length; i++) {
			if (i % 2 == 0) {
				arrB[position] = arrA[i];
				position++;
			}
		}
		System.out.println("\nSo phan tu da xoa : ");
		for (int i = 0; i < arrB.length; i++) {
			System.out.print(arrB[i] + ", ");
		}

	}
}
