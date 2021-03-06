package chapter03;

public class Ex3_4 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		char ch = input.next().charAt(0);
		double num = input.nextDouble();
		if(ch == 'F' || ch == 'f')
			System.out.printf("C%f", (5.0/9.0)*(num - 32));
		else if(ch == 'C' || ch == 'c')
			System.out.printf("F%f", (9.0/5.0)*num + 32);

	}

}
