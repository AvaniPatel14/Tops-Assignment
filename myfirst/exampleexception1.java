package myfirst;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exampleexception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//array out of bound exception
       int[] numbers=new int[10];
       numbers[11]=203;
       System.out.println("at the end");
       
       //if exception occur in try block than control will pass to catch otherwise execute normal execution
       
       try {
		 FileInputStream fis=new FileInputStream("c:\\text.txt");
	   }
       catch (Exception e) {
		e.printStackTrace();
	   }
	}

}
