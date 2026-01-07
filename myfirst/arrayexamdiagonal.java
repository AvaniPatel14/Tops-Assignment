package myfirst;

import java.util.Scanner;

public class arrayexamdiagonal {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of rows and columns");
		int row_col=scan.nextInt();
		int arr[][]=new int[row_col][row_col];
		
		for(int i=0;i<row_col;i++) 
		{
			for(int j=0;j<row_col;j++)
			{
				System.out.println("Please enter elements");
				arr[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<row_col;i++) 
		{
			for(int j=0;j<row_col;j++)
			{
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println("");
		}
		
		for(int i=0;i<row_col;i++) {
			for(int j=0;j<row_col;j++) {
				if(i==j) {
					sum+=arr[i][j];
				}
			}
		}
		
		System.out.println("Addition of Diagonal elements "+sum);
		
		}

	}

