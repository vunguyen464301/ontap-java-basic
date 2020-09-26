package JavaCore.Chaper11;

import java.util.*;

//Viết hàm tìm vị trí phần tử nguyên tố cuối cùng trong ma trận các số nguyên
public class Exercise97 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, positionR, positionC;
		row = 6;
		column = 6;
		positionR = -1;
		positionC = -1;
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = numbRandom.nextInt(100);
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
				if (checkSoNT(matrix[i][j])) {
					positionR = i;
					positionC = j;
				}
			}
			System.out.println();
		}
		System.out.print(
				"Vi tri phan tu so nguyen to cuoi cung trong ma tran:" + "[" + positionR + "]" + "[" + positionC + "]");
	}

	static boolean checkSoNT(int numb) {
		if (numb > 1 && numb < 4)
			return true;
		else if (numb > 3) {
			int count = 0;
			for (int i = 1; i <= numb; i++) {
				if (numb % i == 0)
					count++;
			}
			if (count == 2)
				return true;
		}
		return false;
	}
}
