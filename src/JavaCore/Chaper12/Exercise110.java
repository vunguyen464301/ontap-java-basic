package JavaCore.Chaper12;

import java.util.*;

//Viết hàm đếm các giá trị là bội của 3 và 5 trên đư�?ng chéo chính của ma trận các số nguyên
public class Exercise110 {
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
				if (i == j && (matrix[i][j] % 3 == 0 || matrix[i][j] % 5 == 0)) {
					count++;
				}
			}
			System.out.println();
		}
		System.out.print("So phan tu la boi cua 3 va 5 nam tren duong cheo chinh : " + count);
	}
}
