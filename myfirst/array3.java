package myfirst;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Numbers");
		int no=scan.nextInt();
		int array[]=new int[no];
		
		for(int i=0; i<no; i++) {
			System.out.println("Enter element");
			array[i]=scan.nextInt();
			
		}
		for(int i=0; i<no; i++) {
		System.out.println(array[i]);
		}
		
	//	int numbers[]= {1,45,67,78};
	//	int sum=0;
	// for(int i=0; i<numbers.length; i++) {
	//	System.out.println(numbers[i]);
	//	sum=sum+numbers[i];
			
	//	}
	//	System.out.println("Addition of numbers "+sum);

	}

} 
