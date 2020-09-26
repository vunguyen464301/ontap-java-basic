package Chaper2;

import java.util.*;

//Nhập vào X. Xuất ra màn hình những phần tử có giá trị từ 1 đến x có trong mảng
public class Exercise25 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int valtam = arr[j];
					arr[j] = arr[i];
					arr[i] = valtam;
				}
			}
		}
		int x = in.nextInt();
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= x && arr[i] >= 1) {
				System.out.print(arr[i] + ", ");
			}
		}
		in.close();
	}
}
