package Chaper10;

import java.util.*;

//Viết hàm tính tổng các phần tử trên cùng 1 dòng
public class Exercise81 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, S;
		row = 6;
		column = 6;
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
			System.out.print(" : " + S);
			S = 0;
			System.out.println();
		}
	}
}
