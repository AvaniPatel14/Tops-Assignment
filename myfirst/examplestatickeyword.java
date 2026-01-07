package myfirst;

// static belongs to class not to object
// static methods call through class only without creating objects
// initialize only once

class example1
{ 
  static int i=0;
  int j=0;
  public example1() {
	  i++;
	  j++;
  }
  
  void display() {
	  System.out.println("Static variable "+i);
	  System.out.println("Non Static Variable "+j);
  }
  static void greet() {
	  System.out.println("good morning");
  } 
}

public class examplestatickeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		example1.greet();
		example1 obj=new example1();
		obj.display();
		example1 obj1=new example1();
		obj1.display();
		example1 obj2=new example1();
		obj2.display();
	}

}
