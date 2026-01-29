package myfirst;

//demonstrate try catch block

public class program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
            int a = 10;
            int b = 0;

            int result = a / b; // Exception occurs here
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }

        System.out.println("Program continues normally...");

	}

}
