package JavaCore.Chaper1;

import java.util.*;

//2.	Nhập mảng một chi�?u các số nguyên.
public class Exercise2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int position = 0;
		int[] arrA;
		int[] arrB = null;
		while (position >= 0) {
			position++;
			arrA = new int[position];
			if (arrB != null) {
				for (int i = 0; i < arrB.length; i++) {
					arrA[i] = arrB[i];
				}
				arrA[position-1]=in.nextInt();
			} else {
				arrA[position-1] = in.nextInt();
			}
			for(int i=0;i<arrA.length;i++) {
				System.out.print(arrA[i]+" | ");
			}
			arrB = arrA;			
		}
		in.close();
	}
}
