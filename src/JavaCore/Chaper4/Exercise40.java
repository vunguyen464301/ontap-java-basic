package JavaCore.Chaper4;

import java.util.*;

//Tính tổng các phần tử cực đại trong mảng các số nguyên(phần tử cực đại là phần tử lớn hơn
//các phần tử xung quanh nó
public class Exercise40 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int S = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
				S = S + arr[i];
		}
		System.out.print("Tong cac phan tu cuc dai : " + S);
	}
}
