package JavaCore.Chaper11;

import java.util.*;

//Viết hàm tìm trong ma trận 2 các số nguyên giống nhau
public class Exercise100 {
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
			for (int j = 0; j < column; j++) {
				for (int k = 0; k < row; k++) {
					for (int l = 0; l < column; l++) {
						if (matrix[i][j] == matrix[k][l] && i != k && j != l) {
							System.out.print(matrix[i][j] + " : " + matrix[i][j] + "\n");
						}
					}
				}
			}
		}
	}
}
