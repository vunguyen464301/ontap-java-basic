package JavaCore.Chaper2;

import java.util.*;

//Tìm vị trí phần tử âm lớn nhất trong mảng
public class Exercise19 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int min = 0;
		int position = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= min) {
				min = arr[i];
				position = i;
			}
		}
		System.out.print("\n" + position);
	}
}
