package JavaCore.Chaper8;

import java.util.*;

//Nhập 2 mảng a và b không bằng nhau, ghép 2 mảng này thành mảng c;
public class Exercise68 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arrA, arrB, arrC;
		arrA = new int[numbRandom.nextInt(10)];
		arrB = new int[numbRandom.nextInt(10)];
		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = numbRandom.nextInt(100);
			System.out.print(arrA[i] + ", ");
		}
		System.out.println();
		for (int i = 0; i < arrB.length; i++) {
			arrB[i] = numbRandom.nextInt(100);
			System.out.print(arrB[i] + ", ");
		}
		System.out.println();
		arrC = new int[arrA.length + arrB.length];
		for (int i = 0; i < arrA.length; i++) {
			arrC[i] = arrA[i];
		}
		int countB = 0;
		for (int i = arrA.length; i < arrC.length; i++) {
			arrC[i] = arrB[countB];
			countB++;
		}
		System.out.println();
		for (int i = 0; i < arrC.length; i++) {
			System.out.print(arrC[i] + ", ");
		}
	}
}
