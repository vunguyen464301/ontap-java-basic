package JavaCore.Chaper13;

import java.util.*;

//Viết hàm sắp xếp các cột trên ma trận theo thứ tự giảm dần
public class Exercise119 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column;
		row = 6;
		column = 6;
		int[][] matrix = new int[6][6];
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
