package JavaCore.Chaper6;

import java.util.*;

//Kiểm tra mảng có tồn tại số nguyên tố không
public class Exercise50 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt(100);
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (checkSonguyento(arr[i])) {
				System.out.print("\nMang co ton tai so nguyen to");
				break;
			}
		}
	}

	static boolean checkSonguyento(int numb) {
		int count = 0;
		if (numb > 1 && numb < 4) {
			return true;
		} else if (numb > 3) {
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
