package Chaper7;

import java.util.*;

//Chèn phần tử có giá trị x vào vị trí đầu tiên của mảng
public class Exercise59 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		int x = in.nextInt();
		arr[0] = x;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		in.close();
	}
}
