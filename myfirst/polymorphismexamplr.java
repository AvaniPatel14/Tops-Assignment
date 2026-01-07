package myfirst;

class Shape
{
	 int getArea() 
	 {
	   return 0;
	 }
}
class Rectangle extends Shape{
	
	
	int l,b;
	// constructor for Rectangle labtask
	Rectangle (int l1,int b1){
		l=l1;
		b=b1;
	}
	void getdata(int l1,int b1) {
		l=l1;
		b=b1;
	}
	
	int getArea() {
		return l*b;
	}
	
}
class Square extends Shape{
 
	int s, s1;
	//constructor for square
	Square(int s1){
		s=s1;
	}
	void getdata(int s1) {
	   s=s1;
	}
	
	
	int getArea() {
		return s*s;
	}
}

public class polymorphismexamplr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq=new Square(2);
		//sq.getdata(3);
		System.out.println(sq.getArea());
		
		Rectangle obj=new Rectangle(2,6);
		//obj.getdata(2,6);
		System.out.println(obj.getArea());
		

	}

}
