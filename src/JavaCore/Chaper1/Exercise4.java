package JavaCore.Chaper1;

import java.util.*;

//4.	Tạo ngẫu nhiên các giá trị nguyên cho mảng sao cho mảng tăng dần (không sắp xếp).
public class Exercise4 {
	public static void main(String[] args) {
		Random numRandom = new Random();
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numRandom.nextInt(1000);
			while (i > 0 && arr[i] <= arr[i - 1]) {
				arr[i] = numRandom.nextInt(1000);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " | ");
		}
	}
}
