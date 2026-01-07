package myfirst;

import java.util.Scanner;

public class ternaryoperator {
	
	public static void main(String[] args) {
int number1, number2;
		 
       // Ternary operator(condition)?True:False
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter Number1");
		number1 = scan.nextInt();
		
		System.out.println("Please Enter Number2");
		number2 = scan.nextInt();
		
		int ans=(number1>number2)?number1:number2;
		System.out.println(ans);
		
		String greter, smaller;
		greter = +number1+"\t"+"is Greater than"+"\t"+number2;
		smaller = +number1+"\t"+"is not greter than"+"\t"+number2;
		
		
		String ans2 = (number1>number2)?greter:smaller;
		
		System.out.println(ans2);
	}

}
