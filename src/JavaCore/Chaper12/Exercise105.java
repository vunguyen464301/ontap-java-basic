package JavaCore.Chaper12;

import java.util.*;

//Viết hàm đếm số lần xuất hiện phần tử x có trong ma trận các số thực
public class Exercise105 {
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
				matrix[i][j] = numbRandom.nextInt(20);
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
				if (x == matrix[i][j])
					count++;
			}
		}
		System.out.print("So lan xuat hien phan tu " + x + " : " + count);
		in.close();
	}
}
