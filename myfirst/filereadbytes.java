package myfirst;

import java.io.FileInputStream;
import java.io.IOException;

public class filereadbytes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\Hewlett-Packard\\\\Downloads\\\\STQuestions.txt");
		// System.out.println((char)fis.read());
		// System.out.println((char)fis.read());
		// System.out.println((char)fis.read());
		// System.out.println((char)fis.read());
		
		//to read whole file 1st method
	//	int data = 0;
    //		while(data!=-1)
    //		{
    //			 data=fis.read();
	//		 System.out.print((char)data);
	//	}
		
		// Second method
		byte[] buffer=new byte[20];
		fis.read(buffer);  
		fis.read(buffer, 6, 10);  // labtask -- third method to read 
		String str=new String(buffer);
		System.out.println(str);
	
		
		// third method 
	
		
		
		
		
		
		
		
	}

}
