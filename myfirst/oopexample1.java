package myfirst;

import java.util.Scanner;

class person{
	 int c_no;
	 String  name;
	 
	 void getdetails()
	 {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter Name");
		 name = scan.next();
		 
		 System.out.println("Enter Contact Number");
		 c_no = scan.nextInt();
		 
	 }
	 void display() 
	 {
		 System.out.println(name+"\t"+c_no);  
	 }
}
public class oopexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person p=new person();
		person p1=new person();
		p.getdetails();
		p1.getdetails();
		
		p.display();
		p1.display();
		

	}

}
