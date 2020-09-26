package Chaper12;

import java.util.*;

//Viết hàm đếm các giá trị là số hoàn thiện trong ma trận các số nguyên
public class Exercise115 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, count;
		row = 6;
		column = 6;
		count = 0;
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = numbRandom.nextInt(100);
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
				if (checkSoNT(matrix[i][j]))
					count++;
			}
			System.out.println();
		}
		System.out.print("So phan tu la so hoan thien : " + count);
	}

	static boolean checkSoNT(int numb) {
		int S = 0;
		if (numb > 0) {
			for (int i = 1; i < numb; i++) {
				if (numb % i == 0)
					S = S + i;
			}
			if (numb == S)
				return true;
		}
		return false;
	}
}
