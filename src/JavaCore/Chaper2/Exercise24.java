package JavaCore.Chaper2;

import java.util.*;

//Tìm và đổi chỗ phần tử lớn nhất và nh�? nhất trong mảng
public class Exercise24 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int positionMin = 0;
		int min = 0;
		int positionMax = 0;
		int max = 0;
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt(200);
			System.out.print(arr[i] + ", ");
		}
		min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
				positionMax = i;
			}
			if (arr[i] <= min) {
				min = arr[i];
				positionMin = i;
			}
		}
		arr[positionMax] = min;
		arr[positionMin] = max;
		System.out.println(positionMax + " " + positionMin);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
