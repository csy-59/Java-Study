package chapter03;

public class Ex3_2 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int sum = (int)(input.nextDouble()) + (int)(input.nextDouble());
		System.out.printf("%d, %d", sum, sum/2);
	}

}
