package Chaper2;

import java.util.*;

//Tìm giá trị chẵn cuối cùng có trong mảng, nếu không tồn tại số chẵn hàm trả về -1
public class Exercise23 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		int val = checkArr(arr);
		System.out.print("\n" + val);
	}

	public static int checkArr(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] % 2 == 0)
				return arr[i];
		}
		return -1;
	}
}
