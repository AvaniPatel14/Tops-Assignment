package myfirst;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name,address;
		int id;
		float percentage;
		String grade;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Name");
		name = scan.next();
		
		System.out.println("Enter Id");
		id = scan.nextInt();
		
		System.out.println("Enter percentage");
		percentage = scan.nextFloat();
		
		System.out.println("Enter grade");
		grade = scan.next();
		
		System.out.println(id+"\t"+name+"\t"+percentage+"\t"+grade);
		
		

	}

}
