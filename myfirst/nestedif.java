package myfirst;

import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter Age");
		 int age=scan.nextInt();
		 
		 System.out.println("Enter Weight");
		 int Weight=scan.nextInt();
		 
		 if (age>18)
		 {
			 if (Weight>55)
			 {
				System.out.println("Eligible for Admission"); 
			 }
			 else 
			 {
				 System.out.println("Not eligible due to weight"); 
			 }
		 }
		 else 
		 {
			 System.out.println("Not eligible due to age");
			 
		 }
		 

	}

}
