package Chaper3;

import java.util.*;

//Đếm các phần tử lẻ chẵn trong mảng
public class Exercise28 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int countEven = 0;
		int countOdd = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}
		System.out.print("\nSo phan Tu chan : " + countEven);
		System.out.print("\nSo phan Tu le : " + countOdd);
	}
}
