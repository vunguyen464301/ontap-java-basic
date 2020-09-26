package Chaper1;

//12.	Viết hàm in các phần tử là bội của 3 và 5.
public class Exercise12 {
	public static void main(String[] args) {
		// a=bq 6=1x6=2x3
		for (int i = 3; i <= 50; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.print(i + ", ");
			}
		}
	}
}
