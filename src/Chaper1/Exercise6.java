package Chaper1;

import java.util.*;

//6.	Xuất các phần tử âm trong mảng.
public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				System.out.print(arr[i] + " | ");
			}
		}
		in.close();
	}

}
