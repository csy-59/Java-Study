package chapter03;

public class Ex3_7 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int month = input.nextInt();
		if(month>=1 && month<=6)
			System.out.println("��ݱ��Դϴ�.");
		else if(month>=7 && month<=12)
			System.out.println("�Ϲݱ��Դϴ�.");
		else
			System.err.println("���� �ƴմϴ�.");

	}

}
