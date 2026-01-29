package myfirst;

import java.util.ArrayList;
import java.util.Iterator;

// iterate through all elements in an array list

public class program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ArrayList<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        
	        Iterator i=list.iterator();
	        while(i.hasNext()) {
	        	System.out.println(i.next());
	        }
	        

	}

}
