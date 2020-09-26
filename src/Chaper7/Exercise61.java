package Chaper7;

import java.util.*;

//Chèn phần tử có giá trị x vào trước phần tử có giá trị là số nguyên tố đầu tiên trong mảng
public class Exercise61 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt(100);
			System.out.print(arr[i] + ", ");
		}
		int x = in.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (checkSoNT(arr[i])) {
				arr[i] = x;
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		in.close();

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
