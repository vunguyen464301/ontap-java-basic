package JavaCore.Chaper9;

import java.util.*;

//Viết hàm in ra các phần tử có kí số tận cùng là 5
public class Exercise73 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column;
		row = 3;
		column = 3;
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
		System.out.println("\n");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (matrix[i][j] % 5 == 0 && matrix[i][j] != 0)
					System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
