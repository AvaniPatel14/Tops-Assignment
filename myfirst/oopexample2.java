package myfirst;

class Employee{
	String name;
	int c_no, salary; 
	Employee(String name1, int c_no1, int salary1)
	{
		name =name1;
		c_no=c_no1;
		salary=salary1;
	}
	
	void display() {
		System.out.println(name+"\t"+c_no+"\t"+salary);
	}
}

public class oopexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e=new Employee("Avani",789,78000);
        e.display();
        Employee e1=new Employee("Yuven",76868,988887 );
        e1.display();
	}

}
