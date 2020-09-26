package Chaper11;

import java.util.*;

//Viết hàm tìm vị trí phần tử nhỏ nhất trong ma trận các số nguyên
public class Exercise92 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, min, positionR, positionC;
		row = 6;
		column = 6;
		min = 0;
		positionR = 0;
		positionC = 0;
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = numbRandom.nextInt();
			}
		}
		min = matrix[0][0];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
				if (matrix[i][j] <= min) {
					min = matrix[i][j];
					positionR = i;
					positionC = j;
				}
			}
			System.out.println();
		}
		System.out.print("Vi tri phan tu nho nhat la : " + "[" + positionR + "]" + "[" + positionC + "]");
	}
}
