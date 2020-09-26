package JavaCore.Chaper2;

import java.util.*;

//16.	Tìm (các) vị trí của giá trị nh�? nhất mảng.
public class Exercise16 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int min = 0;
		int position = 0;
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
			if (arr[i] <= min) {
				min = arr[i];
				position = i;
			}
		}
		System.out.print("\nthe positon min of the array : " + position);
	}
}
