package JavaCore.Chaper3;

import java.util.*;

//�?ếm các phần tử là bội của 3 và 5 trong mảng phần tử các số nguyên
public class Exercise33 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt(20);
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0 || arr[i] % 5 == 0)
				count++;
		}
		System.out.print("\nSo phan tu la boi cua 3 va 5 : " + count);
	}
}
