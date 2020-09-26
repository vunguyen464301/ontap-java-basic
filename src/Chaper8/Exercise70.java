package Chaper8;

import java.util.*;

//Nhập 2 mảng a và b có kích thước không bằng nhau và đều có giá trị giảm dần. Ghép 2 mảng
//này thành mảng c sao cho c vẫn giảm dần ( Không sắp xếp trên c)
//Không sắp xếp trên c thì khó
public class Exercise70 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arrA, arrB, arrC;
		arrA = new int[numbRandom.nextInt(5)];
		arrB = new int[numbRandom.nextInt(5)];
		for (int i = 0; i < arrA.length; i++) {
			if (i == 0) {
				arrA[i] = numbRandom.nextInt(100);
			} else {
				while (true) {
					arrA[i] = numbRandom.nextInt(100);
					if (arrA[i] < arrA[i - 1])
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
					if (arrB[i] < arrB[i - 1])
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
				if (arrC[i] < arrC[j]) {
					int temp = arrC[j];
					arrC[j] = arrC[i];
					arrC[i] = temp;
				}
			}
		}
		System.out.println(">>>>>>>>>>>>");
		for (int i = 0; i < arrC.length; i++) {
			System.out.print(arrC[i] + ", ");
		}

	}
}
