package Chaper9;

import java.util.*;

//Viết hàm in ra các phần tử nằm phía trên đường chéo chính của ma trận vuông các số nguyên
public class Exercise77 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column;
		row = 5;
		column = 5;
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
				if (i == j && i != (row - 1)) {
					System.out.print(matrix[i][j + 1] + ", ");
				}
			}
			System.out.println();
		}
	}
}
