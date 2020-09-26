package JavaCore.Chaper11;

import java.util.*;

//Viết hàm tìm phần tử lớn nhất nằm trên đư�?ng chéo chính của ma trận vuông
public class Exercise98 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, max;
		row = 6;
		column = 6;
		max = 0;
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = numbRandom.nextInt(100);
			}
		}
		max = matrix[0][0];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
				if (i == j && matrix[i][j] >= max) {
					max = matrix[i][j];
				}
			}
			System.out.println();
		}
		System.out.print("Phan tu lon nhat nam tren duong cheo chinh: " + max);
	}
}
