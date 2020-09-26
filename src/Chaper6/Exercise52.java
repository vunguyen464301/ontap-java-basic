package Chaper6;

import java.util.*;

//Kiểm tra mảng có tăng dần không
public class Exercise52 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		if (checkArr(arr)) {
			System.out.print("\nMang tang dan");
		} else {
			System.out.print("\nMang khong tang dan");
		}
	}

	static boolean checkArr(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1])
				return false;
		}
		return true;
	}
}
