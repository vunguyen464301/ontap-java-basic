package Chaper2;

import java.util.*;

//18. Tìm vị trí phần tử âm đầu tiên trong mảng nếu không có trả về -1
public class Exercise18 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		int position = checkArr(arr);
		System.out.print("\n" + position);
	}

	public static int checkArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				return i;
		}
		return -1;
	}
}
