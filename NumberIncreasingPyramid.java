import java.util.Scanner;

public class NumberIncreasingPyramid {

	public static void main(String[] args) {
		System.out.println("----Created by Kalai----");
		System.out.print("Enter the input:");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
