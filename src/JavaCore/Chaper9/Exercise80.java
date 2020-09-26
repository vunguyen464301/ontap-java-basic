package JavaCore.Chaper9;

//Viết hàm tạo ma trận a các số nguyên gồm 9 dòng 14 cột  .
//Trong đó phần tử a[i][j]=i*j
public class Exercise80 {
	public static void main(String[] args) {
		int row = 9;
		int column = 14;
		int[][] matrix = new int[9][14];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = i * j;
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
