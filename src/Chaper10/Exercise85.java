package Chaper10;

import java.util.*;

//Viết hàm tính tổng phần tử là số nguyên tố có trong ma trận
public class Exercise85 {
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
				if (checkSoNT(matrix[i][j]))
					S = S + matrix[i][j];
			}
			System.out.println();
		}
		System.out.print("Tong so nguyen to : " + S);
	}

	static boolean checkSoNT(int numb) {
		if (numb > 1 && numb < 4)
			return true;
		else if (numb > 3) {
			int count = 0;
			for (int i = 1; i <= numb; i++) {
				if (numb % i == 0)
					count++;
			}
			if (count == 2)
				return true;
		}
		return false;
	}
}
