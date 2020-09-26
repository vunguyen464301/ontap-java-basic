package Chaper1;

import java.util.*;

//3.	Tạo ngẫu nhiên các giá trị nguyên cho mảng.
public class Exercise3 {
	public static void main(String[] args) {
		Random numRandom = new Random();
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numRandom.nextInt(1000);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " | ");
		}

	}
}
