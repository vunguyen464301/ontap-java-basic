package JavaCore.Chaper11;

import java.util.*;

//Viết hàm tìm dòng có tổng lớn nhất trong ma trận các số thực
public class Exercise101 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, max, positionR, S;
		row = 3;
		column = 3;
		max = 0;
		positionR = -1;
		S = 0;
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = numbRandom.nextInt(100);
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
				S = S + matrix[i][j];
			}
			if (S > max) {
				max = S;
				positionR = i;
			}
			S = 0;
			System.out.println();
		}
		System.out.print("Dong co tong lon nhat : " + positionR);
	}
}
