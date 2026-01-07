package myfirst;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int pattnum=scan.nextInt();
		// labtask
				for(int i=1; i<=pattnum; i++) {
					for(int j=pattnum; j>=i; j--) {
						System.out.print("* ");
					}
					System.out.println(" ");
				}
				
				for(int i=1; i<=pattnum; i++) {
					for(int j=1; j<=i; j++) {
						System.out.print(i+i-1+" ");
					}
					System.out.println(" ");
				}
				
				for(int i=1; i<=pattnum; i++) {
				   	for(int j=pattnum; j>=i; j--) {
  						System.out.print("* ");
					}
					System.out.println(" ");
				}
				for(int i=2; i<=pattnum; i++) {
					for(int j=1; j<i+1; j++) {
						System.out.print("* ");
					}
					System.out.println(" ");
				}
				
				
				for(int i=pattnum; i>=1; i--) {
					for(int j=1; j<=i; j++) {
						System.out.print(j+" ");
					}
					System.out.println(" ");
				}
				 

	}

}
