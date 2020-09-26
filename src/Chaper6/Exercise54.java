package Chaper6;

import java.util.*;

//Kiểm tra mảng có chẵn lẻ xen kẽ không
public class Exercise54 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt(100);
			System.out.print(arr[i] + ", ");
		}
		if (checkArr(arr)) {
			System.out.print("\nMang co chan le xen ke");
		} else {
			System.out.print("\nMang khong co chan le xen ke");
		}

	}

	static boolean checkArr(int[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i - 1] % 2 == 0 && arr[i] % 2 == 0 && arr[i + 1] % 2 == 0)
				return false;
			else if (arr[i - 1] % 2 != 0 && arr[i] % 2 != 0 && arr[i + 1] % 2 != 0)
				return false;
			else if (arr[i - 1] % 2 == 0 && arr[i] % 2 == 0 && arr[i + 1] % 2 != 0)
				return false;
			else if (arr[i - 1] % 2 != 0 && arr[i] % 2 != 0 && arr[i + 1] % 2 == 0)
				return false;
			else if (arr[i - 1] % 2 != 0 && arr[i] % 2 == 0 && arr[i + 1] % 2 == 0)
				return false;
			else if (arr[i - 1] % 2 == 0 && arr[i] % 2 != 0 && arr[i + 1] % 2 != 0)
				return false;
		}
		return true;
	}
}
