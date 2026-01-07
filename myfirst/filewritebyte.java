package myfirst;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class filewritebyte {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		FileOutputStream fos=new FileOutputStream("names.txt");
		String str="Avani , Kushal, Yuven";
		byte[] buffer=str.getBytes();
		fos.write(buffer);
		System.out.println("Data is written");
		
	}

}
