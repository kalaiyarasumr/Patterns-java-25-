
import java.util.*;
import java.util.Scanner;

public class SquareFill {

	public static void main(String[] args) {
		System.out.println("----Created by kalai----");
        System.out.print("Enter the input:");
          Scanner sc = new Scanner(System.in);
          int n =sc.nextInt();
           for(int i=0;i<n;i++) {
        	  for(int j=0;j<n;j++) {
        		  System.out.print("*");
        	  }
        	  System.out.println();
          }
	}

}
