package JavaCore.Chaper2;

import java.util.*;

//13.	Tìm giá trị lớn nhất mảng.
public class Exercise13 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			if (arr[i] >= max)
				max = arr[i];
		}
		System.out.print("max of the arr : " + max);
	}
}
