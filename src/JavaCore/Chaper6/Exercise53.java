package JavaCore.Chaper6;

import java.util.*;

//Kiểm tra mảng có âm dương xen kẽ không
public class Exercise53 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		if (checkArr(arr)) {
			System.out.print("\nMang co am duong xen ke");
		} else {
			System.out.print("\nMang khong co am duong xen ke");
		}
	}

	static boolean checkArr(int[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i + 1] >= 0 && arr[i] >= 0 && arr[i - 1] >= 0)
				return false;
			else if (arr[i + 1] < 0 && arr[i] < 0 && arr[i - 1] < 0)
				return false;
			else if (arr[i + 1] >= 0 && arr[i] >= 0 && arr[i - 1] < 0)
				return false;
			else if (arr[i + 1] < 0 && arr[i] < 0 && arr[i - 1] >= 0)
				return false;
			else if (arr[i + 1] < 0 && arr[i] >= 0 && arr[i - 1] >= 0)
				return false;
			else if (arr[i + 1] >= 0 && arr[i] < 0 && arr[i - 1] < 0)
				return false;

		}
		return true;
	}
}
