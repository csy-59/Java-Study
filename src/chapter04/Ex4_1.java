package chapter04;

public class Ex4_1 {

	public static void main(String[] args) {
		int num = 1;
		for(int i=1;i<=100;i++) {
			if((i%2 == 0) || (i%3==0) ||(i%5==0)||(i%7==0))
					continue;
			else {
				if(num<10) {
					System.out.print(i + " ");
					num++;
				}
				else {
					System.out.print(i + "\n");
					num = 0;
					num++;
				}
			}
		}

	}

}
