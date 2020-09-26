package JavaCore.Chaper1;

import java.util.*;

//arr[i]=numRandom.nextInt(1000);
public class Exercise5 {

	public static void main(String[] args) {
		Random numRandom = new Random();
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numRandom.nextInt(1000);
			while (i > 0 && arr[i] >= arr[i - 1]) {
				arr[i] = numRandom.nextInt(1000);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " | ");
		}

	}

}
