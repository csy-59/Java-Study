package chapter04;

public class Ex4_2 {

	public static void main(String[] args) {
		for(int i=0;i<8;i++) {
			for(int j = 0;j<8-i;j++) {
				System.out.print(" ");
			}
			for(int j = i;j>=0;j--) {
				System.out.printf("%d", j);
			}
			for(int j = 1;j<=i;j++) {
				System.out.printf("%d", j);
			}
			System.out.print("\n");
		}

	}

}
