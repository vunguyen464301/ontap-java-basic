package Chaper3;

import java.util.*;

//Đếm các phần tử nhỏ hơn x trong mảng
public class Exercise30 {
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
			if (arr[i] < x) {
				count++;
			}
		}
		System.out.print("So phan tu nho hon x : " + count);
		in.close();
	}
}
