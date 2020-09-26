package Chaper5;

import java.util.*;

//Sắp xếp mảng theo thứ tự tăng dần của các phần tử là số nguyên tố
public class Exercise46 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		int[] arr = new int[10];
		int count1 = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt(100);
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (checkSonguyento(arr[i])) {
				count1++;
			}
		}
		if (count1 > 1) {
			int[] arrTemp = new int[count1];
			int[] positionTemp = new int[count1];
			int countTemp = 0;
			for (int i = 0; i < arr.length; i++) {
				if (checkSonguyento(arr[i])) {
					arrTemp[countTemp] = arr[i];
					positionTemp[countTemp] = i;
					countTemp++;
				}
			}
			for (int i = 0; i < count1 - 1; i++) {
				for (int j = i + 1; j < count1; j++) {
					if (arrTemp[i] > arrTemp[j]) {
						int temp = arrTemp[j];
						arrTemp[j] = arrTemp[i];
						arrTemp[i] = temp;
					}
				}
			}
			System.out.println();
			for (int i = 0; i < count1; i++) {
				arr[positionTemp[i]] = arrTemp[i];
			}

		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}

	}

	public static boolean checkSonguyento(int numb) {
		if (numb > 1 && numb < 4) {
			return true;
		} else if (numb > 3) {
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
