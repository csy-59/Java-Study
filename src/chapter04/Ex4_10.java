package chapter04;

public class Ex4_10 {

	public static void main(String[] args) {
		int arr[][] = new int[10][];
		for (int i = 0; i < 10; i++) {
			arr[i] = new int[i + 1];
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][j] = (int) ((double) (multiply(i)) / (multiply(j) * multiply(i - j)));

			}
		}

		for (int l[] : arr) {
			for (int v : l) {
				System.out.printf("%d\t", v);
			}
			System.out.print("\n");
		}

	}

	public static int multiply(int n) {
		if (n == 0) {
			return 1;
		}

		int result = 1;
		for (int i = 1; i <= n; i++)
			result *= i;
		return result;
	}

}
