package JavaCore.Chaper10;

import java.util.*;

//Viết hàm tính giá trị trung bình của các phần tử nh�? nhất trên mỗi cột
public class Exercise88 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, S, count, min;
		double Stb;
		row = 3;
		column = 3;
		S = 0;
		Stb = 0;
		count = 0;
		min = 0;
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = numbRandom.nextInt(100);
			}
		}
		for (int i = 0; i < row; i++) {
			min = matrix[i][0];
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
				if (matrix[i][j] <= min) {
					min = matrix[i][j];
				}
			}
			S = S + min;
			count++;
			System.out.println();
		}
		Stb = S / count;
		System.out.print("Gia tri trung binh thap nhat tren moi cot : " + Stb);
	}
}
