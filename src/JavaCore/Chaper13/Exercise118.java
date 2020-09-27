package JavaCore.Chaper13;

import java.util.*;

//Viết hàm sắp xếp các dòng trên ma trận theo thứ tự tăng dần
public class Exercise118 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column;
		row = 6;
		column = 6;
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
			for (int j = 0; j < column - 1; j++) {
				for (int k = j + 1; k < column; k++) {
					if (matrix[i][j] > matrix[i][k]) {
						int temp = matrix[i][k];
						matrix[i][k] = matrix[i][j];
						matrix[i][j] = temp;
					}
				}
			}
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
