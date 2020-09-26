package JavaCore.Chaper8;

import java.util.*;

//Tách mảng thành 2 mảng con, 1 mảng chứa các giá trị là số hoàn thiện, 1 mảng chứa các
//giá trị còn lại
public class Exercise67 {
	public static void main(String[] args) {
		Random number = new Random();
		int[] arr = new int[10];
		int[] arrA;
		int[] arrB;
		int countA = 0;
		int countB = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = number.nextInt(20);
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (checkSoHT(arr[i]))
				countA++;
			else
				countB++;
		}
		arrA = new int[countA];
		arrB = new int[countB];
		countA = 0;
		countB = 0;
		for (int i = 0; i < arr.length; i++) {
			if (checkSoHT(arr[i])) {
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

	static boolean checkSoHT(int numb) {
		int S = 0;
		for (int i = 1; i < numb; i++) {
			if (numb % i == 0)
				S = S + i;
		}
		if (S == numb)
			return true;
		return false;
	}
}
