package JavaCore.Chaper10;

import java.util.*;

//Viết hàm tính tổng các giá trị "nh�? nhất" nằm trên từng đư�?ng chéo loại 2
//lú luôn loại 2, không biết==>ko làm
public class Exercise89 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int row, column, S;
		row = 3;
		column = 3;
		S = 0;
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
		System.out.print("Tong gia tri nho nhat tren duong cheo loai 2: " + S);
	}
}
