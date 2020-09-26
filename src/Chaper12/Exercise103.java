package Chaper12;

import java.util.*;

//Viết hàm đếm các giá trị âm dương trong ma trận các số thực
public class Exercise103 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, count;
		row = 3;
		column = 3;
		count = 0;
		Float[][] matrix = new Float[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = numbRandom.nextFloat();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
				if (matrix[i][j] < 0)
					count++;
			}
			System.out.println();
		}
		System.out.print("So phan tu am co trong mang : " + count + "\n");
		System.out.print("So phan tu duong co trong mang : " + (row * column - count));
	}
}
