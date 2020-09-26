package JavaCore.Chaper9;

import java.util.*;

//Viết hàm nhập xuất ma trận các số thực
public class Exercise72 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int column, row;
		row = 3;
		column = 3;
		float[][] matrix = new float[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = in.nextFloat();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
		in.close();
	}
}
