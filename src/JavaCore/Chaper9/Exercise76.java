package JavaCore.Chaper9;

import java.util.*;

//Viết hàm in ra các phần tử nằm phía dưới đư�?ng chéo phụ của ma trận vuống các số nguyên
public class Exercise76 {
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
		System.out.println();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (i + j == (row - 1) && j != (column - 1))
					System.out.print(matrix[i][j + 1]);
			}
			System.out.println();
		}
	}
}
