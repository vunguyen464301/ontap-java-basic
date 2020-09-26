package Chaper6;

import java.util.*;

//Kiểm tra mảng có toàn chẵn không
public class Exercise51 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt(200);
			System.out.print(arr[i] + ", ");
		}
		if (checkArr(arr)) {
			System.out.print("\nMang toan chan");
		} else {
			System.out.print("\nMang khong toan chan");
		}

	}

	static boolean checkArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				return false;
		}
		return true;
	}
}
