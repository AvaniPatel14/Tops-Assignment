package myfirst;

import java.util.Scanner;

public class Assignmentoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number");
		num=scan.nextInt();
		System.out.println(num+=10);
		System.out.println(num-=10);
		System.out.println(num*=10);
		System.out.println(num/=10);
		
		num=200;
		int i =num++;  // num++ = num+=1;
		System.out.println("i="+i+"num="+num);
		
		num=200;
		int j=++num;
		System.out.println("j="+j+"num="+num);
		num--;
		--num;
		
	 
	}

}
