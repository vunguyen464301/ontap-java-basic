package JavaCore.Chaper1;

import java.util.*;

//7.	Xuâ�?t ca�?c phần tử lẻ co�? trong mảng.
public class Exercise7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " | ");
			}
		}
		in.close();
	}
}
