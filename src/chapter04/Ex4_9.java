package chapter04;

public class Ex4_9 {

	public static void main(String[] args) {
		int prime[] = new int[1000];
		int num = 0;
		boolean flag = true;
		
		System.out.print(1 + " ");

		for (int i = 2; i <= 1000; i++) {
			for (int j = 0; j < num; j++) {
				if (i % prime[j] == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.printf("%d ", i);
				prime[num] = i;
				num++;
			}
			flag = true;
		}

	}

}
