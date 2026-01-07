package myfirst;

import java.util.Scanner;

public class ifelseifstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter Age");
		 int age=scan.nextInt();
		 
		 if (age>0 && age<=2)
		 {
			 System.out.println("User is infant");
		 }
		 else if (age>=3 && age<=18)
		 {
			 System.out.println("User is minor");
		 }
		 else if (age>=19 && age<=50)
		 {
			 System.out.println("User is adult");
		 }
		 else if (age>=50 && age<=70)
		 {
			 System.out.println("User is Senior");
		 }
		 else if (age>=70)
		 {
			 System.out.println("User is Supersenior");
		 }
		 else 
		 {
			 System.out.println("Age is Invalid"); 
		 }
		 
	}

}
