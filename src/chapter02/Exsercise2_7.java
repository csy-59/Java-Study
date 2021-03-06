package chapter02;

public class Exsercise2_7 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("이름 학번 입력: ");
		String name = input.next();
		int num = input.nextInt();
		System.out.print("이름: " + name + ", 학번: " + num);

	}

}
