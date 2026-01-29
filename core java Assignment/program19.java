package myfirst;

// update specific array element by given element.

import java.util.Scanner;

public class program19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter index to update: ");
        int index = sc.nextInt();

        System.out.print("Enter new value: ");
        int newValue = sc.nextInt();

        if (index >= 0 && index < arr.length) {
            arr[index] = newValue;
            System.out.println("Element updated successfully.");
        } else {
            System.out.println("Invalid index!");
        }

        // Display updated array
        System.out.print("Updated array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

	}

}
