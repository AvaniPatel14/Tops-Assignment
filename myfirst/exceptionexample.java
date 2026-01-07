package myfirst;
//runtime exception  -- handle automatically 

import java.io.FileInputStream;
import java.util.Scanner;

public class exceptionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		//Arithmetic exception
		int ans=12/2;
		System.out.println(ans);
		
		//input mismatch exception
		Scanner scan=new Scanner(System.in);
		int no=scan.nextInt();
		System.out.println(no);
		try 
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\Hewlett-Packard\\Downloads\\STQuestions.txt");
		}
		catch(Exception e) {
			System.out.println("in a catch ");
		}
	}

}
