package Chaper1;

import java.util.*;

//10.	Nhập vào số nguyên n và liệt kê các số nguyên tố nhỏ hơn n,
//nếu mảng không tồn tại số nguyên tố nào nhỏ hơn n thì phải xuất ra một câu thông báo.
public class Exercise10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random numbRandom = new Random();
		int n = in.nextInt();
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			while (true) {
				arr[i] = numbRandom.nextInt(100);
				if (arr[i] > 1 && arr[i] < 4) {
					break;
				} else {
					int dem = 0;
					for (int numb = 1; numb <= arr[i]; numb++) {
						if (arr[i] % numb == 0)
							dem++;
					}
					if (dem == 2) {
						break;
					}
				}
			}
		}
		System.out.println("Danh sách số nguyên tố : ");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + ", ");
		}
		int dem = 0;
		System.out.println();
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < n) {
				System.out.print(arr[j] + ", ");
				dem++;
			}
		}
		if (dem == 0) {
			System.out.println("Không có số nguyên tố nào cả !");
		}
		in.close();
	}
}
