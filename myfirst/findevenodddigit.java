package myfirst;

import java.util.Scanner;

public class findevenodddigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter Number"); 
		int num=scan.nextInt();
		int rem;
		int evencount=0;
		int oddcount=0;
		while(num!=0)
		{ 
			rem=num%10;
			if(rem%2==0)
			{
				evencount++;
			
			}
			else 
			{
				oddcount++;

			}
			
			num=num/10;
		
		}
		System.out.print(" even= "+evencount+" odd= " +oddcount);	

	}

}
