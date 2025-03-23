import java.util.Scanner;

public class ReverseHalfPyramid {

		public static void main(String[] args) {
			System.out.println("----Created by Kalai----");
			System.out.println("Enter the input:");
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n-i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		}

	}


