package JavaCore.Chaper7;

import java.util.*;

//Nhập vào giá trị x. Viết hàm xóa các phần tử có giá trị x gần nhất,dựa trên giá trị tuyệt đối
//8 3 5 6 2 1 6 =>x =5 => xóa 6 và 3
//�?ang làm dở
public class Exercise58 {
	public static void main(String[] args) {
		Random numbRandom = new Random();
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
		int x = in.nextInt();
		int y = x;
//		while(true) {
//			for(int i = 0;i<arr.length;i++) {
//				if(x==arr[i])break;
//			}
//			x++;
//		}
//		while(true) {
//			for(int i = 0;i<arr.length;i++) {
//				if(y==arr[i])break;
//			}
//			y++;
//		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = numbRandom.nextInt();
			System.out.print(arr[i] + ", ");
		}
	}
}
