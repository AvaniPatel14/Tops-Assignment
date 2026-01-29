package myfirst;

//find the second largest element in an array

public class program23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 25, 30, 11};

        if (arr.length < 2) {
            System.out.println("No second largest element");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }

	}

}
