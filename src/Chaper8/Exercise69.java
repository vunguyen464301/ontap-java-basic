package Chaper8;

import java.util.*;

//Nhập 2 mảng a và b có kích thước không bằng nhau và đều có giá trị tăng dần, ghép 2 mảng này
//thành mảng c sao cho c vẫn được tăng dần(Không sắp xếp trên c)
//KHÔNG SẮP XẾP TRÊN C THÌ KHÓ
public class Exercise69 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arrA, arrB, arrC;
		arrA = new int[numbRandom.nextInt(10)];
		arrB = new int[numbRandom.nextInt(10)];
		for (int i = 0; i < arrA.length; i++) {
			if (i == 0) {
				arrA[i] = numbRandom.nextInt(100);
			} else {
				while (true) {
					arrA[i] = numbRandom.nextInt(100);
					if (arrA[i] > arrA[i - 1])
						break;
				}
			}
			System.out.print(arrA[i] + ", ");
		}
		System.out.println();
		for (int i = 0; i < arrB.length; i++) {
			if (i == 0) {
				arrB[i] = numbRandom.nextInt(100);
			} else {
				while (true) {
					arrB[i] = numbRandom.nextInt(100);
					if (arrB[i] >= arrB[i - 1])
						break;
				}
			}
			System.out.print(arrB[i] + ", ");
		}
		arrC = new int[arrA.length + arrB.length];
		for (int i = 0; i < arrA.length; i++) {
			arrC[i] = arrA[i];
		}
		int countB = 0;
		for (int i = arrA.length; i < arrC.length; i++) {
			arrC[i] = arrB[countB];
			countB++;
		}
		// sort
		for (int i = 0; i < arrC.length - 1; i++) {
			for (int j = i + 1; j < arrC.length; j++) {
				if (arrC[i] > arrC[j]) {
					int temp = arrC[j];
					arrC[j] = arrC[i];
					arrC[i] = temp;
				}
			}
		}

		System.out.println();
		for (int i = 0; i < arrC.length; i++) {
			System.out.print(arrC[i] + ", ");
		}

	}
}
