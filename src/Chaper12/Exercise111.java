package Chaper12;

import java.util.*;

//Viết hàm đếm các giá tri là số nguyên tố trên 2 đường chéo chính,phụ của ma trận vuông các 
//số nguyên
public class Exercise111 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, count;
		row = 3;
		column = 3;
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
				if (i == j || (i + j == (row - 1)) && checkSoNT(matrix[i][j]))
					count++;
			}
			System.out.println();
		}
		System.out.print("So phan tu la so nguyen to nam tren 2 duong cheo : " + count);
	}

	static boolean checkSoNT(int numb) {
		if (numb > 1) {
			int count = 0;
			for (int i = 1; i <= numb; i++)
				if (numb % i == 0)
					count++;
			if (count == 2)
				return true;
		}
		return false;
	}
}
