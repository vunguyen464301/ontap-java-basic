package JavaCore.Chaper4;

import java.util.*;

//Tính giá trị trung bình các số hoàn thiện trong mảng các số nguyên
public class Exercise44 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int S = 0;
		int count = 0;
		double Stb = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt(20);
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (checkSohoanthien(arr[i])) {
				S = S + arr[i];
				count++;
			}
		}
		Stb = (double) S / count;
		if (count != 0) {
			System.out.print("\nTrung binh so hoan thien co trong mang : " + Stb);
		}
	}

	public static boolean checkSohoanthien(int numb) {
		int S = 0;
		if (numb > 1) {
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
