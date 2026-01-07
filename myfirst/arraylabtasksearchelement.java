package myfirst;

import java.util.Scanner;

public class arraylabtasksearchelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter rows/columns");
		int no=scan.nextInt();
		int array[][]=new int[no][no];
		int newno, i, temp=0;
		
	for( i=0; i<no; i++)
	{
		for(int j=0; j<no; j++)
		{
		System.out.println("Enter row Element");
		 array[i][j]=scan.nextInt();	
		}
	}


	 for(i=0; i<no; i++)
		{
			for(int j=0; j<no; j++)
			{
			System.out.print("\t"+array[i][j]);
			}
			System.out.println("");
		}  
	 
	 System.out.println("search number");
	 newno=scan.nextInt();
	 
	for(i=0;i<no;i++) {
		for(int j=0; j<no; j++) {
			if(newno==array[i][j]) {
				System.out.println("Element found");
				break;
		    }
		    else {
		    	temp=1;
		    }
		}
		
	}
	if(temp==1) {
		System.out.println("Element is not found");
	}
	
  
	}   

}
