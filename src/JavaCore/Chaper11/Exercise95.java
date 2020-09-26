package JavaCore.Chaper11;

import java.util.*;

//Viết hàm tìm phần tử chẵn dương nh�? nhất trong ma trận
public class Exercise95 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, min, positionR, positionC;
		row = 6;
		column = 6;
		min = 0;
		positionR = -1;
		positionC = -1;
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = numbRandom.nextInt(100);
			}
		}
		min = matrix[0][0];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
				if (matrix[i][j] % 2 == 0 && matrix[i][j] <= min) {
					min = matrix[i][j];
					positionR = i;
					positionC = j;
				}
			}
			System.out.println();
		}
		System.out.print("Vi tri phan tu chan duong nho nhat : " + "[" + positionR + "]" + "[" + positionC + "]");
	}
}
