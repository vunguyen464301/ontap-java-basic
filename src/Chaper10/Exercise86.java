package Chaper10;

import java.util.*;

//Viết hàm tính tổng các phần tử là số hoàn thiện trong ma trận các số nguyên
public class Exercise86 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, S;
		row = 6;
		column = 6;
		S = 0;
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = numbRandom.nextInt(100);
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
				if (checkSoHT(matrix[i][j]))
					S = S + matrix[i][j];
			}
			System.out.println();
		}
		System.out.print("Tong so hoan thien la : " + S);
	}

	static boolean checkSoHT(int numb) {
		if (numb > 0) {
			int S = 0;
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
