package Chaper2;

import java.util.*;

//14.	Tìm giá trị nhỏ nhất mảng.
public class Exercise14 {
	public static void main(String[] args) {
		Random numbRandom = new Random();

		int[] arr = new int[10];
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.println(arr[i]);
			if (arr[i] <= min)
				min = arr[i];
		}
		System.out.print("Min of the array : " + min);
	}
}
