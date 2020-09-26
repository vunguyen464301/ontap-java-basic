package Chaper1;

import java.util.*;

//9.	Xuất ra màn hình các phần tử là số nguyên tố. 
public class Exercise9 {
	public static void main(String[] args) {
		Random numRandom = new Random();
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numRandom.nextInt(100);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 1) {
				int dem = 0;
				for (int num = 2; num <= arr[i]; num++) {
					if (arr[i] % num == 0) {
						dem++;
					}
				}
				if (dem == 1) {
					System.out.print(arr[i] + " | ");
				}
			}
		}

	}
}
