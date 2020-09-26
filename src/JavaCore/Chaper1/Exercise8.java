package JavaCore.Chaper1;

import java.util.*;

//8.	Xuâ�?t ra ca�?c phần tử chẵn nhỏ hơn 20.
public class Exercise8 {

	public static void main(String[] args) {
		Random numRandom = new Random();
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numRandom.nextInt(30);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0 && arr[i] < 20) {
				System.out.print(arr[i] + " | ");
			}
		}

	}

}
