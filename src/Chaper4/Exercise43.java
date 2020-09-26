package Chaper4;

import java.util.*;

//Tính tổng các phần tử là số hoàn thiện trong mảng các số nguyên
public class Exercise43 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int S = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (checkSohoanthien(arr[i]))
				S = S + arr[i];
		}
		System.out.print("\nTong phan tu la so hoan thien co trong mang : " + S);

	}

	public static boolean checkSohoanthien(int numb) {
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
