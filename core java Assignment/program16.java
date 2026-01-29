package myfirst;

// demonstrate multiple catch blocks

public class program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 try {
	            int[] arr = {10, 20, 30};

	            int a = 10 / 0;          // ArithmeticException
	            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
	        }
	        catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exception: Cannot divide by zero");
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array Index Out Of Bounds");
	        }
	        catch (Exception e) {
	            System.out.println("General Exception");
	        }

	        System.out.println("Program continues normally...");

	}

}
