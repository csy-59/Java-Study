package chapter04;

public class Ex4_8 {

	public static void main(String[] args) {
		int list[][] = {{78,48,78,98},{99,92},{29,64,83},{34,78,92,56}};
		int sum=0;
		int num =0;
		
		for(int arr[] : list) {
			for(int v : arr) {
				System.out.print(v+" ");
				sum+=v;
				num++;
			}
			System.out.print("\n");
		}
		System.out.printf("%d, %.1f", sum, (double)(sum/num));

	}

}
