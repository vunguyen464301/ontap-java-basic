package JavaCore.Chaper10;

import java.util.*;

//Viết hàm tính tổng các phần tử nằm trên đư�?ng chéo chính của ma trận vuông
public class Exercise84 {
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
				if (i == j)
					S = S + matrix[i][j];
			}
			System.out.println();
		}
		System.out.print("Tong phan tu nam tren duong cheo chinh : " + S);
	}
}
