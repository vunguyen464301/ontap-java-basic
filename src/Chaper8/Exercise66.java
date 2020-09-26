package Chaper8;

import java.util.*;

//Tách mảng thành 2 mảng con, 1 mảng chứa giá trị là số chính phương và 1 mảng chứa các giá trị còn lại
public class Exercise66 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int[] arrA;
		int[] arrB;
		int countA = 0;
		int countB = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt(200);
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (checkSoChinhPhong(arr[i])) {
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
			if (checkSoChinhPhong(arr[i])) {
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

	static boolean checkSoChinhPhong(int numb) {
		int a = (int) Math.sqrt(numb);
		double b = (double) Math.sqrt(numb);
		if (a == b) {
			return true;
		}
		return false;
	}
}
