package Chaper2;

import java.util.*;

//17.	In vị trí các phần tử nguyên tố trong mảng.
public class Exercise17 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		String position = "";
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt(20);
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			int dem = 0;
			if (arr[i] > 1 && arr[i] <= 3) {
				position = position + String.valueOf(i) + ", ";
			} else if (arr[i] > 3) {
				for (int numb = 1; numb <= arr[i]; numb++) {
					if (arr[i] % numb == 0)
						dem++;
				}
				if (dem == 2) {
					position = position + String.valueOf(i) + ", ";
				}
			}
		}
		System.out.print("\n" + position);

	}
}
