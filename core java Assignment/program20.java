package myfirst;

import java.util.ArrayList;

//remove the third element from a array list

public class program20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");
	        list.add("Elderberry");

	        // Remove the 3rd element (index 2)
	        if (list.size() >= 3) {
	            list.remove(2);
	        }

	        // Display updated list
	        System.out.println("Updated ArrayList: " + list);


	}

}
