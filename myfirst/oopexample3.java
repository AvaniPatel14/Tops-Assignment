package myfirst;

class A{
	void displyA() {
		System.out.println("in DisplayA");
	}
}

class B extends A{
	void displyB() {
		System.out.println("in DisplayB");
	}
	
}
public class oopexample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B objb=new B();
		objb.displyA();
		objb.displyB();

	}

}
