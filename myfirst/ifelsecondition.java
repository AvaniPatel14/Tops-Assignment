package myfirst;

import java.util.Scanner;

public class ifelsecondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter Age");
		 int age=scan.nextInt();
		 
		 if (age>18)
		 {
			 System.out.println("User is adult");
		 }
		 else 
		 {
			 System.out.println("User is not adult");
		 }
		 

	}

}
