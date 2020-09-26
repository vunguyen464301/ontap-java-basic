package JavaCore.Chaper12;

import java.util.*;

//Viết hàm đếm các giá trị nh�? hơn x trong ma trận các số thực
public class Exercise106 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		Scanner in = new Scanner(System.in);
		int row, column, count, x;
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
			}
			System.out.println();
		}
		x = in.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (matrix[i][j] < x)
					count++;
			}
		}
		System.out.print("So phan tu nho hon " + x + " : " + count);
		in.close();
	}
}
