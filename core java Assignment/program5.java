package myfirst;

import java.util.Scanner;

public class program5 {

	// Program to check given number is armstrong number or not
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int no=scan.nextInt();
		int reminder1=0; double total=0;
		int n = 0;
		
		while(no!=0) {
			no/=10;
			n++;
		}
		System.out.println(n);
		
		int originalnumber = 0;
		originalnumber=no;
		
		while(originalnumber!=0) {
		    reminder1=originalnumber%10;
			total=total+ Math.pow(reminder1, n);
			originalnumber=originalnumber/10; 	
			
		}
		
		System.out.println(total);
		System.out.println(no);
		
		if(total == no) {
			System.out.println("number is armstrong number");
		}
		else {
			System.out.println("number is not armstrong number");
		}

	}

}
