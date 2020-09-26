package JavaCore.Chaper4;

import java.util.*;

//Tính tổng các phần tử là bội của 3 và 5 trong mảng các số nguyên
public class Exercise42 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int S = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[i] % 3 == 0 || arr[i] % 5 == 0)
				S = S + arr[i];
		}
		System.out.print("\nTong cac phan tu la boi 3 va 5 : " + S);
	}
}
