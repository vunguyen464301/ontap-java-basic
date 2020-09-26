package Chaper11;

import java.util.*;

//Viết hàm in các số nguyên tố nằm trên đường chéo phụ của ma trận vuông
public class Exercise99 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, SoNT;
		row = 6;
		column = 6;
		SoNT = -1;
		int[][] matrix = new int[6][6];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = numbRandom.nextInt(100);
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
				if (i + j == (row - 1) && checkSoNT(matrix[i][j])) {
					SoNT = matrix[i][j];
				}
			}
			if (SoNT != -1)
				System.out.print("{" + SoNT + "}");
			SoNT = -1;
			System.out.println();
		}
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
