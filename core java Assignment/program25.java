package myfirst;

//program to check grade of the student

import java.util.Scanner;

public class program25 {
	
	 static void displayGrade(int marks) {
	        if (marks >= 91 && marks <= 100) {
	            System.out.println("Grade: AA");
	        } else if (marks >= 81) {
	            System.out.println("Grade: AB");
	        } else if (marks >= 71) {
	            System.out.println("Grade: BB");
	        } else if (marks >= 61) {
	            System.out.println("Grade: BC");
	        } else if (marks >= 51) {
	            System.out.println("Grade: CD");
	        } else if (marks >= 41) {
	            System.out.println("Grade: DD");
	        } else if (marks >= 0) {
	            System.out.println("Grade: Fail");
	        } else {
	            System.out.println("Invalid marks");
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter marks (out of 100): ");
	        int marks = sc.nextInt();

	        if (marks > 100) {
	            System.out.println("Invalid marks");
	        } else {
	            displayGrade(marks);
	        }

	        sc.close();

	}

}
