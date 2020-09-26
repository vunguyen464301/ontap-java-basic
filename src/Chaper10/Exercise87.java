package Chaper10;

import java.util.*;

//Viết hàm tính tổng các giá trị lớn nhất trên mỗi dòng
public class Exercise87 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, S, max;
		row = 3;
		column = 3;
		S = 0;
		max = 0;
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = numbRandom.nextInt(100);
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
				if (matrix[i][j] >= max)
					max = matrix[i][j];
			}
			S = S + max;
			max = 0;
			System.out.println();
		}
		System.out.print("Tong gia tri lon nhat tren moi dong : " + S);
	}
}
