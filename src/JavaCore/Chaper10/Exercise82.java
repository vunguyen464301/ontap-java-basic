package JavaCore.Chaper10;

import java.util.*;

//Viết hàm tính tổng các phần tử trên cùng 1 cột
public class Exercise82 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, S;
		row = 3;
		column = 3;
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
				S = S + matrix[j][i];
			}
			System.out.print(": " + S);
			S = 0;
			System.out.println();
		}
	}
}
