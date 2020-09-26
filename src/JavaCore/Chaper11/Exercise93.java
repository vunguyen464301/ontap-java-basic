package JavaCore.Chaper11;

import java.util.*;

//Viết hàm tìm vị trí phần tử chẵn cuối cùng trong ma trận các số nguyên
public class Exercise93 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, positionR, positionC;
		row = 6;
		column = 6;
		positionR = -1;
		positionC = -1;
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = numbRandom.nextInt(100);
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
				if (matrix[i][j] % 2 == 0) {
					positionR = i;
					positionC = j;
				}
			}
			System.out.println();
		}
		if (positionR != -1)
			System.out.print("Vi tri phan tu chan cuoi cung: " + "[" + positionR + "]" + "[" + positionC + "]");
	}
}
