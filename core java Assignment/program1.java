package myfirst;

import java.util.Scanner;

public class program1 {
  
	// Program for find gretest number among entered 3 numbers
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number 1");
		int n1 = scan.nextInt();
		System.out.println("Enter Number 2");
		int n2= scan.nextInt();
		System.out.println("Enter Number 3");
		int n3 = scan.nextInt();

		if(n1>n2 && n1>n3) 
		{
			System.out.println(n1+" is the Greatest number");
		}
		else if(n2>n3) 
		{
			System.out.println(n2+" is the Greatest number");
		}
		else {
			System.out.println(n3+" is the Greatest number");
		}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
		
	}

}
