package myfirst;

import java.util.Scanner;

public class additionclasspractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number up to what you need addition");
		int num=scan.nextInt();
		int sum=0;
		for (int i=1; i<=num; i++) {
			sum=sum+i;
			
		}
		System.out.print("Addition from 1 to given number= "+sum);

	}

}
