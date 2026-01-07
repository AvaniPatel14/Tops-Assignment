package myfirst;

import java.util.Scanner;

public class multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter Number");
		int num=scan.nextInt();
		
		for(int i=1;i<=10;i++) 
		{
			int mul=i*num;
			System.out.println(num+" * "+i+" = "+mul);
		}

	}

}
