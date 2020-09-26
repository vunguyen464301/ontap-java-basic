package JavaCore.Chaper2;

import java.util.*;

//15.	Tìm (các) vị trí của giá trị lớn nhất mảng.
public class Exercise15 {
	public static void main(String[] args) {
		Random numbRandom= new Random();
		int[] arr= new int[10];
		int max=0;
		int position=0;
		for(int i =0;i<arr.length;i++) {
			arr[i]=numbRandom.nextInt();
			System.out.print(arr[i]+", ");
			if(arr[i]>=max) {
				max=arr[i]; position=i;
			}
		}
		
		System.out.print("\nthe position max of the array : "+position);
	}
}
