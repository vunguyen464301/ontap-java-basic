package Chaper12;

import java.util.*;

//Viết hàm đếm các giá trị cực đại trong ma trận các số nguyên
//=>là lớn hơn các phần tử xung quanh nó
public class Exercise112 {
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
				if (j >= 1 && j < (column - 2) && matrix[i][j - 1] < matrix[i][j] && matrix[i][j] > matrix[i][j + 1]) {
					count++;
				}
			}
			System.out.println();
		}
		System.out.print("SO phan tu cuc dai : " + count);
	}
}
