package chapter03;

public class Ex3_8 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int max = input.nextInt();
		int n = input.nextInt();
		if(max <= n)
			max = n;
		n = input.nextInt();
		if(max <= n)
			max = n;
		
		System.out.println(max);

	}

}
