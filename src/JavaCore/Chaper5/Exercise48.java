package JavaCore.Chaper5;

import java.util.*;

//Sắp xếp các phần tử chẵn giảm dần
public class Exercise48 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt(100);
			System.out.print(arr[i] + ", ");
		}
		if (arr.length > 2) {
			int temp1 = arr.length / 2;
			double temp2 = (double) arr.length / 2;
			int temp3 = 0;
			if (temp1 == temp2) {
				temp3 = 3;
			} else {
				temp3 = 2;
			}
			for (int i = 0; i < arr.length - temp3; i = i + 2) {
				for (int j = i + 2; j < arr.length - temp3 + 2; j = j + 2) {
					if (arr[i] < arr[j]) {
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
