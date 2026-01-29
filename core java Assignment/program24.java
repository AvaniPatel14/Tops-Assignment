package myfirst;

//Create an abstract class 'Parent' with a method 'message'. It
//has two subclasses each having a method with the same name
//'message' that prints "This is first subclass" and "This is second
//subclass" respectively

abstract class Parent {
    abstract void message();
}

// First subclass
class FirstSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is first subclass");
    }
}

// Second subclass
class SecondSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is second subclass");
    }
}
public class program24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent obj1 = new FirstSubclass();
        Parent obj2 = new SecondSubclass();

        obj1.message();
        obj2.message();

	}

}
