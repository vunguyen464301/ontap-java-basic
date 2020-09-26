package Chaper9;

import java.util.*;

//Viết chương trình khởi tạo giá trị các phần tử là ngẫu nhiên cho ma trận 
//các số nguyên kích thước m*n
public class Exercise79 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column;
		row = checkIntputNumb(numbRandom);
		column = checkIntputNumb(numbRandom);
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
	}

	static int checkIntputNumb(Random numb) {
		while (true) {
			int n = numb.nextInt(10);
			if (n > 0)
				return n;
		}
	}
}
