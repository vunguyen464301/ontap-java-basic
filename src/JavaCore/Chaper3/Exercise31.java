package JavaCore.Chaper3;

import java.util.*;

//�?ếm các phần tử là số nguyên tố trong mảng
public class Exercise31 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt(100);
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			int countNumb = 0;
			if (arr[i] > 1 && arr[i] < 4) {
				count++;
			} else if (arr[i] > 3) {
				for (int numb = 1; numb <= arr[i]; numb++) {
					if (arr[i] % numb == 0)
						countNumb++;
				}
			}
			if (countNumb == 2)
				count++;
		}
		System.out.print("\nSo phan tu so nguyen to : " + count);
	}
}
