package myfirst;

import java.util.Scanner;


public class program8 {
	
	static boolean isPrime(int num) {
	    if (num < 2) return false;
	    for (int i = 2; i <= Math.sqrt(num); i++) {
	        if (num % i == 0)
	            return false;
	    }
	    return true;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 
		 int count = 0;
	        int number = 2;
	        long sum = 0;

	        while (count < 100) {
	            if (isPrime(number)) {
	                sum += number;
	                count++;
	            }
	            number++;
	        }

	        System.out.println("Sum of first 100 prime numbers: " + sum);

	}

}
