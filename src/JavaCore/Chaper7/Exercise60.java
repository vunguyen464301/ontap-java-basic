package JavaCore.Chaper7;

import java.util.*;

//Chèn phần tử x vào vị trí phía sau phần tử lớn nhất trong mảng
public class Exercise60 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		int max = 0;
		int position = -1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt(200);
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
				position = i;
			}
		}
		int x = in.nextInt();
		if (position != -1 && position != arr.length - 1) {
			arr[position + 1] = x;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		in.close();
	}
}
