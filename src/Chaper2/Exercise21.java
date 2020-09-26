package Chaper2;

import java.util.*;

//Tìm vị trí phần tử dương bé nhất trong mảng
public class Exercise21 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int postion = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= max && arr[i] >= 0) {
				max = arr[i];
				postion = i;
			}
		}
		System.out.print("\n" + postion);

	}
}
