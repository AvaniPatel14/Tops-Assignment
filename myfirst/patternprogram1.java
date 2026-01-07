package myfirst;

import java.util.Scanner;

public class patternprogram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int pattnum=scan.nextInt();
		
		for(int i=0; i<pattnum; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
	/*	for(int i=1; i<=pattnum; i++) {
			for(int j=1; j<i+1; j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		} 
		
		for(int i=1; i<=pattnum; i++) {
			for(int j=1; j<=i+1; j++) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
		
		
		for(int i=1; i<=pattnum; i++) {
			for(int j=pattnum; j>=i; j--) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
		} */
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
