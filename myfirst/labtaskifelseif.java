package myfirst;

import java.util.Scanner;

public class labtaskifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter Percentage");
		 Float percentage=scan.nextFloat();
		 
		 if (percentage>=40 && percentage<=55)
		 { 
			 System.out.println("Grade C");
		 }
		 else if (percentage>=56 && percentage<=70)
		 {
			 System.out.println("Grade B");
		 }
		 else if (percentage>=71 && percentage<=80)
		 {
			 System.out.println("Grade A");
		 }
		 else if (percentage>=80)
		 {
			 System.out.println("Grade A+");
		 }
		 else 
		 {
			 System.out.println("Fail"); 
		 }

	}

}
