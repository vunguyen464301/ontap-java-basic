package Chaper4;

import java.util.*;

//Tính tổng các phần tử cực tiểu trong mảng các số nguyên (phần tử cực tiểu là phần tử
//nhỏ hơn các phần tử xung quanh nó
public class Exercise41 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int S = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1])
				S = S + arr[i];
		}
		System.out.print("\nTong cac phan tu cuc tieu co trong mang : " + S);
	}
}
