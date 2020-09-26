package JavaCore.Chaper2;

import java.util.*;

//Nhập vào một dãy số a gồn n số nguyên (n<=100), nhập vào dãy số b gồm m số nguyên (m<=100)
//c1: In ra những phần tử chỉ xuất hiện trong dãy số a mà không xuất hiện trong dãy b
//c2: in ra những phần tử xuất hiện cả 2 dãy
public class Exercise26 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arrA = new int[10];
		int[] arrB = new int[10];
		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = numbRandom.nextInt(20);
			System.out.print(arrA[i] + ", ");
		}
		System.out.println();
		for (int i = 0; i < arrB.length; i++) {
			arrB[i] = numbRandom.nextInt(20);
			System.out.print(arrB[i] + ", ");
		}
		// c1:
		System.out.println();
		for (int i = 0; i < arrA.length; i++) {
			if (checkArr(arrB, arrA[i]) == true) {
				System.out.print(arrA[i] + ", ");
			}
		}
		// c2:
		System.out.println();
		for (int i = 0; i < arrA.length; i++) {
			if (checkBothArr(arrB, arrA[i]) == true) {
				System.out.print(arrA[i] + ", ");
			}
		}
	}

	public static boolean checkArr(int[] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			if (val == arr[i])
				return false;
		}
		return true;
	}

	public static boolean checkBothArr(int[] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			if (val == arr[i])
				return true;
		}
		return false;
	}

}
