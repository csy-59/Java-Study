package chapter03;

public class Ex3_10 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int money = input.nextInt();
		if(money>=50000) {
			System.out.print("50000원권 " + money/50000 + "개 ");
			money%=50000;
		}
		if(money>=10000) {
			System.out.print("10000원권 " + money/10000 + "개 ");
			money%=10000;
		}
		if(money>=5000) {
			System.out.print("5000원권 " + money/5000 + "개 ");
			money%=5000;
		}
		if(money>=1000) 
			System.out.print("1000원권 " + money/1000 + "개 ");

	}

}
