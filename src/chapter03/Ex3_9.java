package chapter03;

public class Ex3_9 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int height = input.nextInt();
		int weight = input.nextInt();
		//(weight<=((height-100)*0.9))?System.out.println("����") : System.out.println("��"); 
		if(weight<=((height-100)*0.9))
			System.out.println("����");
		else
			System.out.println("��");

	}

}
