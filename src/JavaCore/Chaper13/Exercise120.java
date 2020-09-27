package JavaCore.Chaper13;

import java.util.*;

//Cho ma trận vuông, viết hàm sắp xếp tăng dần các phần tử nằm trên các đường chéo 
//song song với đường chéo chính
public class Exercise120 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column;
		row = 4;
		column = 4;
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = numbRandom.nextInt(100);
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if ((i - 1) == j) {
					for (int k = i + 1; k < row; k++) {
						for (int l = j + 1; l < row; l++) {
							if ((k - 1) == l) {
								int temp = matrix[k][l];
								matrix[k][l] = matrix[i][j];
								matrix[i][j] = temp;
							}
						}
					}
				}
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
