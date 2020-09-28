package JavaCore.Chaper14;

import java.util.*;

//Viết hàm xóa một cột j trên ma trận
public class Exercise122 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		Scanner in = new Scanner(System.in);
		int row, column, countColumn;
		row = 6;
		column = 6;
		countColumn = 0;
		int[][] matrix1 = new int[row][column];
		int[][] matrix2 = new int[row][column - 1];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix1[i][j] = numbRandom.nextInt(100);
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix1[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println();
		int x = in.nextInt();
		for (int j = 0; j < column; j++) {
			if (j != x) {
				for (int i = 0; i < row; i++) {
					matrix2[i][countColumn] = matrix1[i][j];
				}
				countColumn++;
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column - 1; j++) {
				System.out.print(matrix2[i][j] + ", ");
			}
			System.out.println();
		}
		in.close();
	}
}
