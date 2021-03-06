package chapter03;

public class Ex3_6 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int num = input.nextInt();
		
		System.out.println(num/10000 + "만 " + (num%10000)/1000 + "천 " + (num%1000)/100 + "백 " + (num%100)/10 + "십 " + num%10 + "십 입니다.");

	}

}
