package JavaCore.Chaper4;

import java.util.*;

//Tính tổng các phần tử lẻ trong mảng các số nguyên
public class Exercise35 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int S = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				S = S + arr[i];
		}
		System.out.print("\nTong phan tu le trong mang : " + S);
	}
}
