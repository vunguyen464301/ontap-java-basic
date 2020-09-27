package JavaCore.Chaper13;

import java.util.*;

//Viết hàm sắp xếp ma trận theo thứ tự giảm dần từ trên xuống dưới từ trái sang phải
public class Exercise117 {
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
					if (matrix[i][j] < matrix[i][k]) {
						int temp = matrix[i][k];
						matrix[i][k] = matrix[i][j];
						matrix[i][j] = temp;
					}
				}
			}
		}
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row - 1; j++) {
				for (int k = j + 1; k < row; k++) {
					if (matrix[j][i] < matrix[k][i]) {
						int temp = matrix[k][i];
						matrix[k][i] = matrix[j][i];
						matrix[j][i] = temp;
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
