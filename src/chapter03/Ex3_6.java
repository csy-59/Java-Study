package chapter03;

public class Ex3_6 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int num = input.nextInt();
		
		System.out.println(num/10000 + "�� " + (num%10000)/1000 + "õ " + (num%1000)/100 + "�� " + (num%100)/10 + "�� " + num%10 + "�� �Դϴ�.");

	}

}
