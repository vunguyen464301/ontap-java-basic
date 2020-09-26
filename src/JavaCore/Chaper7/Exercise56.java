package JavaCore.Chaper7;

import java.util.*;

//Xóa phần tử có giá trị lớn nhất trong mảng
public class Exercise56 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arrA = new int[10];
		int[] arrB = new int[9];
		int max = -1;
		int position = -1;
		int count = 0;
		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = numbRandom.nextInt(200);
			System.out.print(arrA[i] + ", ");
		}
		for (int i = 0; i < arrA.length; i++) {
			if (arrA[i] >= max) {
				max = arrA[i];
				position = i;
			}
		}
		for (int i = 0; i < arrA.length; i++) {
			if (i != position) {
				arrB[count] = arrA[i];
				count++;
			}
		}
		System.out.println();
		for (int i = 0; i < arrB.length; i++) {
			System.out.print(arrB[i] + ", ");
		}

	}
}
