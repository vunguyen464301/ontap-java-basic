package JavaCore.Chaper12;

import java.util.*;

//Viết hàm đếm các giá trị cực tiểu trong ma trận các số nguyên
public class Exercise113 {
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
				if (j > 0 && j < (row - 2) && matrix[i][j - 1] > matrix[i][j] && matrix[i][j] < matrix[i][j + 1])
					count++;
			}
			System.out.println();
		}
		System.out.print("So phan tu cuc tieu trong ma tran : " + count);
	}
}
