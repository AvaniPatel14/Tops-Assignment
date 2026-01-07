package myfirst;

class person1{
	int c_no;
	String name;
	
	person1(String name1, int c_no1){
		name=name1;
		c_no=c_no1;
	}
	
	
	void display() {
		System.out.println(name+"\t"+c_no);
	}
}
class Employee1 extends person1
{

	Employee1(String name1, int c_no1) {
		super(name1, c_no1);
		// TODO Auto-generated constructor stub
	}
	
}
public class inheritanceexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 =new Employee1("Yuven",567677);
		e1.display();

	}

}
