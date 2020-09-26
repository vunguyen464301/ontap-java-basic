package Chaper3;

import java.util.*;

//Đếm các phần tử là số hoàn thiện trong mảng
public class Exercise32 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt(20);
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (checkSoHoanThien(arr[i]) == true && arr[i] > 1)
				count++;
		}
		System.out.print("\nTong so hoan thien : " + count);
	}

	public static boolean checkSoHoanThien(int numb) {
		int s = 0;
		for (int i = 1; i < numb; i++) {
			if (numb % i == 0)
				s++;
		}
		if (s == numb)
			return true;
		return false;
	}
}
