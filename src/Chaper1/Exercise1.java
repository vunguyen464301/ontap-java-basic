package Chaper1;

import java.util.*;

//1.	Nhập số lượng phần tử n cho mảng một chi�?u các số nguyên (0<n<=100)
public class Exercise1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " | ");
		}
		in.close();
	}
}
