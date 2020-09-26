package Chaper2;

import java.util.*;

//Tìm vị trí phần tử có giá trị x xuất hiện cuối cùng trong mảng
public class Exercise22 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		int position = -1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt(200);
			System.out.print(arr[i] + ", ");
		}
		int x = in.nextInt();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == x) {
				position = i;
			}
		}
		System.out.print("\n" + position);
		in.close();
	}
}
