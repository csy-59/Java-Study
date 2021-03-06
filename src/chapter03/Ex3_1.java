package chapter03;

public class Ex3_1 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		double sum = input.nextDouble() + input.nextDouble();
		System.out.printf("%f, %f", sum, sum/2);

	}

}
