package JavaCore.Chaper14;

import java.util.*;

//Viết hàm xóa dòng có tổng lớn nhất trên ma trận
public class Exercise123 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, Smax, rowMax, countRow;
		row = 6;
		column = 6;
		countRow = 0;
		Smax = 0;
		rowMax = 0;
		int[][] matrix1 = new int[row][column];
		int[][] matrix2 = new int[row - 1][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix1[i][j] = numbRandom.nextInt(100);
			}
		}
		for (int i = 0; i < row; i++) {
			int S = 0;
			for (int j = 0; j < column; j++) {
				System.out.print(matrix1[i][j] + ", ");
				S = S + matrix1[i][j];
			}
			if (S > Smax) {
				Smax = S;
				rowMax = i;
			}
			System.out.println();
		}
		for (int i = 0; i < row; i++) {
			if (i != rowMax) {
				for (int j = 0; j < column; j++) {
					matrix2[countRow][j] = matrix1[i][j];
				}
				countRow++;
			}
		}
		System.out.println();
		for (int i = 0; i < row - 1; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix2[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
