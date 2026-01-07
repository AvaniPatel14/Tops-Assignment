package myfirst;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exampleexception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  int[] numbers=new int[10];
          System.out.println(numbers[11]);
          
          FileInputStream fis=new FileInputStream("file");
    	  
      }
      catch(ArrayIndexOutOfBoundsException e){
    	  System.out.println("In a catch");
    	  e.printStackTrace();
      }
      catch(FileNotFoundException f) {
    	  System.out.println("In a catch"); 
     }
      catch(Exception e) {
    	  System.out.println("In a all exception"); 
    	  e.printStackTrace();
      }
      finally {
    	  System.out.println("finally always executed"); 
      }
      
	}

}
