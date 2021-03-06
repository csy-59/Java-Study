package chapter04;

public class Ex4_3 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int num = input.nextInt();
		
		do {
			System.out.printf("%d", num%10);
			num/=10;
		}while(num>0);

	}

}
