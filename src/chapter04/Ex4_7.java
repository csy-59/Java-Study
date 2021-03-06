package chapter04;

public class Ex4_7 {

	public static void main(String[] args) {
		int i=0;
		int sum = 0;
		while(sum<5000) {
			i++;
			sum += i;
		}
		System.out.printf("%d %d", sum-i,--i);

	}

}
