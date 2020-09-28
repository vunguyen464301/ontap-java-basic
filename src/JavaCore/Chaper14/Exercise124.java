package JavaCore.Chaper14;

import java.util.*;

//Viết hàm hoán vị dòng có tổng lớn nhất và dòng có tổng nhỏ nhất
public class Exercise124 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, Smax, Smin, rowMax, rowMin;
		row = 3;
		column = 1;
		Smax = 0;
		rowMax = 0;
		Smin = 0;
		rowMin = 0;
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = numbRandom.nextInt(100);
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
		for (int i = 0; i < row; i++) {
			int Sm = 0;
			int Sn = 0;
			if (i == 0) {
				for (int j = 0; j < column; j++) {
					Smax = Smax + matrix[i][j];
					Smin = Smax;
					rowMax = i;
					rowMin = i;
				}
			} else {
				for (int j = 0; j < column; j++) {
					Sm = Sm + matrix[i][j];
					Sn = Sn + matrix[i][j];
				}
				if (Sm > Smax) {
					Smax = Sm;
					rowMax = i;
				}
				if (Sn < Smin) {
					Smin = Sn;
					rowMin = i;
				}
			}
		}
		int[] arr = new int[column];

		for (int j = 0; j < column; j++) {
			arr[j] = matrix[rowMin][j];
			matrix[rowMin][j] = matrix[rowMax][j];
			matrix[rowMax][j] = arr[j];
		}
		System.out.println();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}

	}
}
