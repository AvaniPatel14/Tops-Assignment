	package myfirst;

import java.util.Scanner;

public class comparisionoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		int number1, number2;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter Number1");
		number1 = scan.nextInt();
		
		System.out.println("Please Enter Number2");
		number2 = scan.nextInt();
		
		System.out.println(number1+">"+number2+"is"+(number1>number2));
		System.out.println(number1+"<"+number2+"is"+(number1<number2));
		System.out.println(number1+"!="+number2+"is"+(number1!=number2));
		
		System.out.println(number1>number2 && number1>100);
		System.out.println(number1>number2 || number2>100);
		
		
		 
		

	}

}
