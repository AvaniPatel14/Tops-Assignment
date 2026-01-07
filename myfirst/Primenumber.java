package myfirst;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//prime number is a number that is devided by 1 and itself only example 13,19,23

		
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter Number");
		int num=scan.nextInt();
		int temp=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				temp=0;
				break;
			}
			else {
				temp=1;
			}
		}
		if(temp==1) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
		
	}

}
