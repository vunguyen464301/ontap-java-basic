package Chaper8;

import java.util.*;

//Tách mảng thành 2 mảng con, 1 mảng chứa các giá trị là số nguyên tố 
//và 1 mảng chứa các giá trị còn lại
public class Exercise65 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int[] arrA;
		int[] arrB;
		int countA = 0;
		int countB = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt(100);
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (checkSoNT(arr[i]))
				countA++;
			else
				countB++;
		}
		arrA = new int[countA];
		arrB = new int[countB];
		countA = 0;
		countB = 0;
		for (int i = 0; i < arr.length; i++) {
			if (checkSoNT(arr[i])) {
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

	static boolean checkSoNT(int numb) {
		if (numb > 1 && numb < 4) {
			return true;
		} else if (numb > 3) {
			int count = 0;
			for (int i = 1; i <= numb; i++) {
				if (numb % i == 0)
					count++;
			}
			if (count == 2)
				return true;
		}
		return false;
	}
}
