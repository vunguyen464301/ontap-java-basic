package JavaCore.Chaper6;

import java.util.*;

//Kiểm tra mảng có tồn tại số lẻ không
public class Exercise49 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print("\nMang co ton tai so le ! ");
				break;
			}
		}
	}
}
