package myfirst;

import java.util.Scanner;

public class Program3 {
  
	// program to find factorial number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number to find factorial");
		int number=scan.nextInt();
		int fact=1;
		
		for (int i=1; i<=number; i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
