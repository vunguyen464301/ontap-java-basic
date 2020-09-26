package Chaper10;

import java.util.*;

//Viết hàm tính tổng các phần tử chẵn có trong ma trận
public class Exercise83 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, S;
		row = 6;
		column = 6;
		S = 0;
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = numbRandom.nextInt(200);
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
				if (matrix[i][j] % 2 == 0)
					S = S + matrix[i][j];
			}
			System.out.println();
		}
		System.out.print("\nTong phan tu chan : " + S);

	}
}
