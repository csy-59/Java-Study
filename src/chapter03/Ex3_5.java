package chapter03;

public class Ex3_5 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int year = input.nextInt();
		if((year%4 ==0 && !(year%100 == 0))||year%400 ==0)
			System.out.println("¿±≥‚¿‘¥œ¥Ÿ.");
		else
			System.out.println("¿±≥‚¿Ã æ∆¥’¥œ¥Ÿ.");

	}

}
