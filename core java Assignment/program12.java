package myfirst;

//find the maximum and minimum value of an array.

public class program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {54, 61, 4, 85, 35};

        int max = arr[0];
        int min = arr[0];

        // Find max and min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);


	}

}
