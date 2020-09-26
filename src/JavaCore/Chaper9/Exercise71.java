package JavaCore.Chaper9;

import java.util.*;

//Viết hàm nhập ma trận các số nguyên dương, nhập sai báo lỗi và không cho nhập
public class Exercise71 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int column = 3;
		int row = 2;
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = inputNumb(in);
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

	static int inputNumb(Scanner in) {
		while (true) {
			System.out.print("Input to positive number : ");
			int n = in.nextInt();
			if (n > 0) {
				return n;
			}
			System.out.print("Fail, please again ! \n");

		}
	}

}
