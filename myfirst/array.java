 package myfirst;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declare array having 10 numbers
		int[] numbers=new int[10];
		
		numbers[5]=890;
		numbers[2]=76;
		numbers[7]=80;
		
		//print all elements of array
		
//		System.out.println(numbers[0]);
	//	System.out.println(numbers[1]);
	//	System.out.println(numbers[2]);
	//	System.out.println(numbers[3]);
	//	System.out.println(numbers[4]);
	//	System.out.println(numbers[5]);
	//	System.out.println(numbers[6]);
	//	System.out.println(numbers[7]);
	//	System.out.println(numbers[8]);
	//	System.out.println(numbers[9]);
       
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
