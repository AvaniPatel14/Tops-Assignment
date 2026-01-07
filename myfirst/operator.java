 package myfirst;

import java.util.Scanner;

public class operator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub 
		
		int a=100 , b=50 , ans;
		System.out.println(ans=a+b);
		System.out.println(ans=a-b);
		System.out.println(ans=a*b);
		System.out.println(ans=a/b);
		 
		int number1, number2;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter Number1");
		number1 = scan.nextInt();
		
		System.out.println("Please Enter Number2");
		number2 = scan.nextInt();
		
		System.out.println("Addition is"+(ans=number1+number2));
		System.out.println("Substraction is"+(ans=number1-number2));
		System.out.println("Multiplication is"+(ans=number1*number2));
		System.out.println("Division is"+(ans=number1/number2));
		System.out.println("Reminder is"+(ans=number1%number2));
		
		

	}

}
