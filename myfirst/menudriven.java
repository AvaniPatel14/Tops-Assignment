package myfirst;

import java.util.Scanner;

public class menudriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		do {
			System.out.println("1. Check number is Prime\r\n"
					+"2. Check Number is Even/Odd\r\n"
					+"3. Reverse Number\r\n"
					+"4. Exit\r\n"
					+ "Enter your Choice\r\n"
					+ "");
			
			
			switch(choice)
			{
					case 1: System.out.println("Enter Number");
					int num=scan.nextInt();
					int temp=0;
					for(int i=2;i<num;i++) {
						if(num%i==0) {
							temp=0;
							break;
						}
						else {
							temp=1;
						}
					}
					if(temp==1) {
						System.out.println("Number is prime");
					}
					else {
						System.out.println("Number is not prime");
					}
					break;
					
					case 2: System.out.println("Enter Number");
					num=scan.nextInt();
					if(num%2==0)
					{
						System.out.println("Number is Even");
					}
					else {
						System.out.println("Number is odd");
					}
					break;
					
					case 3:
					System.out.println("Enter Number"); 
					num=scan.nextInt();
					int rem;
					
					 while(num!=0) 
					 {
						 rem=num%10;
						 System.out.print(rem);
						 num=num/10;
					 }
					 break;
					
					
					case 4: System.out.println("Bye");
				
					
					
					
			}
		
			
		}
		while(choice!=4);

	}

}
