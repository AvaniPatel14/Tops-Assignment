package myfirst;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// array elements values starting from 1000
		
		int[] numbers=new int[20];
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i]=1000+i;
			System.out.println(numbers[i]);
		}

	}

}
