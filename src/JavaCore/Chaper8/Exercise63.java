package JavaCore.Chaper8;

import java.util.*;

//Tách mảng thành 2 mảng con, 1 mảng chứa các giá trị âm, và 1 mảng chứa các giá trị >=0
public class Exercise63 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int[] arrA;
		int[] arrB;
		int countA = 0;
		int countB = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				countA++;
			} else {
				countB++;
			}
		}
		arrA = new int[countA];
		arrB = new int[countB];
		countA = 0;
		countB = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arrA[countA] = arr[i];
				countA++;
			} else {
				arrB[countB] = arr[i];
				countB++;
			}
		}
		System.out.println();
		for (int i = 0; i < arrA.length; i++) {
			System.out.print(arrA[i] + ", ");
		}
		System.out.println();
		for (int i = 0; i < arrB.length; i++) {
			System.out.print(arrB[i] + ", ");
		}

	}
}
