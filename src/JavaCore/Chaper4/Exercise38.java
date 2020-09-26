package JavaCore.Chaper4;

import java.util.*;

//Tính tổng các phần tử nằm ở vị trí nguyên tố trong mảng
public class Exercise38 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int S = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt(200);
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (checkVitri(i))
				S = S + arr[i];
		}
		System.out.print("\nTong cac phan tu nam o vi tri nguyen to trong mang : " + S);
	}

	public static boolean checkVitri(int position) {
		if (position > 1 && position < 4)
			return true;
		else if (position > 3) {
			int count = 0;
			for (int i = 1; i < position; i++) {
				if (position % i == 0)
					count++;
			}
			if (count == 2)
				return true;
		}
		return false;
	}
}
