package chapter03;

public class Ex3_7 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int month = input.nextInt();
		if(month>=1 && month<=6)
			System.out.println("상반기입니다.");
		else if(month>=7 && month<=12)
			System.out.println("하반기입니다.");
		else
			System.err.println("달이 아닙니다.");

	}

}
