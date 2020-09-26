package JavaCore.Chaper3;

import java.util.*;

//đếm các phần tử âm dương trong mảng
public class Exercise27 {
	public static void main(String[] args) {
		Random numbrandom = new Random();
		int[] arr = new int[10];
		int countMinus = 0;
		int countPositive = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbrandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				countPositive++;
			} else if (arr[i] < 0) {
				countMinus++;
			}
		}
		System.out.print("\nSo phan tu am: " + countMinus);
		System.out.print("\nSo phan tu duong: " + countPositive);
	}
}
