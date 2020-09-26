package Chaper4;

import java.util.*;

//Tính tổng các phần tử nguyên tố trong mảng
public class Exercise36 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int S = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (checkSonguyento(arr[i]))
				S = S + arr[i];
		}
		System.out.print("\nTong phan tu so nguyen to trong mang : " + S);

	}

	public static boolean checkSonguyento(int numb) {
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
