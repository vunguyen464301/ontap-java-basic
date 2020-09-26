package JavaCore.Chaper11;

import java.util.*;

//Viết hàm tìm cột có tổng nh�? nhất trong ma trận các số nguyên
public class Exercise102 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, min, S, positionC;
		row = 3;
		column = 3;
		min = 0;
		S = 0;
		positionC = -1;
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
				S = S + matrix[j][i];
			}
			if (i == 0)
				min = S;
			if (S <= min) {
				min = S;
				positionC = i;
			}
			S = 0;
		}
		System.out.print("\nVi tri cot co tong so phan tu nho nhat : " + positionC);
	}
}
