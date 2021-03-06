package chapter03;

public class Ex3_9 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int height = input.nextInt();
		int weight = input.nextInt();
		//(weight<=((height-100)*0.9))?System.out.println("정상") : System.out.println("비만"); 
		if(weight<=((height-100)*0.9))
			System.out.println("정상");
		else
			System.out.println("비만");

	}

}
