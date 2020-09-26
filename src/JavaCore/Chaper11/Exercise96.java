package JavaCore.Chaper11;

import java.util.*;

//Viet ham tim so hoan thien dau tien trong ma tran cac so nguyen
public class Exercise96 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column;
		row = 6;
		column = 6;
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
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (checkSOHT(matrix[i][j])) {
					System.out.print(matrix[i][j] + ", ");
					break;
				}

			}
			System.out.println();
		}
	}

	static boolean checkSOHT(int numb) {
		if (numb > 0) {
			int S = 0;
			for (int i = 1; i < numb; i++) {
				if (numb % i == 0)
					S = S + i;
			}
			if (S == numb)
				return true;
		}
		return false;
	}
}
