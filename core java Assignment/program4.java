package myfirst;

import java.util.Scanner;

public class program4 {
	
	// Program to find given number is prime or not

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int no=scan.nextInt();
		
		int temp=0;
		for(int i=2;i<no;i++) {
			if(no%i==0)
			{
				temp=0;
				break;
			}
			else {
				temp=1;
			}
			
		}
		
		if(temp==1) {
			System.out.println("Number is Prime");
		}
		else {
			System.out.println("Number is not Prime");
		}

	}

}
