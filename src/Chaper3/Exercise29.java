package Chaper3;

import java.util.*;

//Đếm số lần xuất hiện phần tử x trong mảng
public class Exercise29 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		Scanner in = new Scanner(System.in);

		int count = 0;
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		int x = in.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				count++;
			}
		}
		System.out.print("So phan tu xuat hien : " + count);
		in.close();
	}
}
