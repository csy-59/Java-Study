package chapter04;

public class Ex4_5 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		double money = input.nextInt();
		
		if(money == 1000000) {
			for(int i = 1;i<=10;i++) {
				money += money*4.5*i;
				System.out.printf("%d year: %.1f\n", i, money);
			}
		}
		else {
			System.err.print("µ· ºÎÁ·");
		}

	}

}
