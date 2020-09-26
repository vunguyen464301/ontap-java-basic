package JavaCore.Chaper10;

import java.util.*;

//Viết hàm tìm đư�?ng chéo có tổng lớn nhất trong các đư�?ng chéo "loại 1"
//=>lú luôn
public class Exercise90 {
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
			}
			System.out.println();
		}
		System.out.print("Tong gia tri lon nhat trong duong cheo : " + S);
	}
}
