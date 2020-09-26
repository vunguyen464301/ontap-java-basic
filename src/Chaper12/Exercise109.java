package Chaper12;

import java.util.*;

//Viết hàm đếm các giá trị chẵn trên đường chéo chính của ma trận vuông các số nguyên
public class Exercise109 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, count;
		row = 6;
		column = 6;
		count = 0;
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = numbRandom.nextInt(100);
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
				if (i == j && matrix[i][j] % 2 == 0)
					count++;
			}
			System.out.println();
		}
		System.out.print("So phan tu chan tren duong cheo chinh : " + count);
	}
}
