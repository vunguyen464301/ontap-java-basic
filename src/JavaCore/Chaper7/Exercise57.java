package JavaCore.Chaper7;

import java.util.*;

//Nhập vào giá trị x. Viết hàm xóa các phần tử có giá trị nh�? hơn x
public class Exercise57 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		Scanner in = new Scanner(System.in);
		int[] arrA = new int[10];
		int[] arrB;
		int countI = 10;
		int countII = 0;
		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = numbRandom.nextInt(100);
			System.out.print(arrA[i] + ", ");
		}
		int x = in.nextInt();
		for (int i = 0; i < arrA.length; i++) {
			if (arrA[i] < x) {
				countI--;
			}
		}
		arrB = new int[countI];
		for (int i = 0; i < arrA.length; i++) {
			if (arrA[i] > x) {
				arrB[countII] = arrA[i];
				countII++;
			}
		}
		System.out.println();
		for (int i = 0; i < arrB.length; i++) {
			System.out.print(arrB[i] + ", ");
		}
		in.close();
	}
}
