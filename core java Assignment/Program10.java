package myfirst;

//calculate the average value of array elements.

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        // Calculate sum of array elements
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Calculate average
        double average = (double) sum / arr.length;

        System.out.println("Average value of array elements: " + average);


	}

}
