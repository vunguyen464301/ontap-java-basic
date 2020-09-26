package Chaper2;

import java.util.*;

//Tìm vị trí phần tử dương đầu tiên trong mảng nếu không có trả về -1
public class Exercise20 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		int positon = checkArray(arr);
		System.out.print("\n" + positon);

	}

	public static int checkArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				return i;
		}
		return -1;
	}
}
