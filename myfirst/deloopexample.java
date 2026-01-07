package myfirst;

public class deloopexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do {
			System.out.println("Hello "+i);
		    i++;
		} 
		while(i<=10); 
		
		int j=10;
		do {
			System.out.println("Bye "+j);
		    j--;
		} 
		while(j>=1); 
		
		// lab task 
		
		
		int x=100;
		do {
			if(x%3==0) {
				System.out.println(+x);
			}
			x++;
		}
		while(x<=200);
		

	}

}
