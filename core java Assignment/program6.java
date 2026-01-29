package myfirst;

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program for fibonacci Series
		 int n1 = 0, n2 = 1;
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter Number");
		 int N=scan.nextInt();
		 

	        for (int i = 0; i < N; i++) {
	            // Print the number
	            System.out.print(+n1 + " ");

	            // Swap
	            int n3 = n2 + n1;
	            n1 = n2;
	            n2 = n3;
	        }    

	}

}
