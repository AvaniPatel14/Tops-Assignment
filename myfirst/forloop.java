package myfirst;

import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<=200;i++)
		{    
			if(i%3==0 && i%7==0)
			System.out.println(i);
		}
		
		//lab task 
		
		int num1 , num2;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Number 1");
		num1=scan.nextInt();
		System.out.println("Enter Number 2");
		num2=scan.nextInt();
		
		for(int j=num1;j<=num2;j++)
		{    
			if(j%3==0 && j%7==0)
			System.out.println(j);
		}

	}

}
 