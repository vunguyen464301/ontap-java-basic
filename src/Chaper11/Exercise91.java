package Chaper11;

import java.util.*;

//Viết hàm tìm vị trí phần tử lớn nhất trong ma trận các số nguyên
public class Exercise91 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, max, positionR, positionC;
		row = 6;
		column = 6;
		max = 0;
		positionR = 0;
		positionC = 0;
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = numbRandom.nextInt(100);
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
				if (matrix[i][j] >= max) {
					max = matrix[i][j];
					positionR = i;
					positionC = j;
				}
			}
			System.out.println();
		}
		System.out.print("Vi tri phan tu lon nhat : " + "[" + positionR + "]" + "[" + positionC + "]");
	}
}
