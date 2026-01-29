package myfirst;

import java.util.Scanner;

//sum values of an array

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter numbers of array element");
		int num=scan.nextInt();
		
		int[] array=new int[num];
		int sum=0;
		for(int i=0; i<num; i++) {
			System.out.println("Enter element");
			array[i]=scan.nextInt();		
		}
		for(int i=0; i<num; i++) {
			System.out.println(array[i]);
			
			sum=sum+array[i];
			
			}
		
		System.out.println("Sum of array elements are " +sum);
		
		

	}

}
