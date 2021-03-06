package chapter04;

public class Ex4_4 {

	public static void main(String[] args) {
		for(double i = 5;i<=10;i+=0.5) {
			System.out.printf("%.1f %.1f\n", i, 4*Math.pow(i, 4) + 5*Math.pow(i, 3) + i + 2);
		}

	}

}
