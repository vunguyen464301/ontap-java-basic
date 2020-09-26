package JavaCore.Chaper1;

import java.util.*;

//11.	Xuâ�?t ra màn hình ca�?c phần tử là sô�? chi�?nh phương nằm tại những vị tri�? lẻ trong mảng.
public class Exercise11 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			while (true) {
				arr[i] = numbRandom.nextInt(100);
				int n = (int) Math.sqrt(arr[i]);
				double d = Math.sqrt(arr[i]);
				if (n == d)
					break;
			}
		}
		System.out.println("List array");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + ", ");
		}
		System.out.println();
		for (int j = 0; j < arr.length; j++) {
			if (j % 2 != 0) {
				System.out.print(arr[j] + ", ");
			}
		}
	}
}
