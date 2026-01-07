package myfirst;

// can not extend final class
// can not overload final method
// can not change the value of final variable,  we can show the error as follow

class First
{   
	 int val=20;
	 void greet()
	{
		System.out.println("Hello");
		val=200;
	}
}

class Second extends First
{
	void greet()
	{
		System.out.println("Good morning");
	} 
	
}

public class examplefinaldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
