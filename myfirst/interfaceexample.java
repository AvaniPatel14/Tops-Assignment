package myfirst;

public class interfaceexample implements mathinterface,stringinterface {
	
	@Override
	public int addition(int no1, int no2) {
		// TODO Auto-generated method stub
		return no1+no2;
	}
	
	@Override
	public int Substraction(int no1, int no2) {
		// TODO Auto-generated method stub
		return no1-no2;
	}
	 @Override  
	public String greet(String name) {
		// TODO Auto-generated method stub
		return "Goodmorning" +name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interfaceexample obj=new interfaceexample();
		System.out.println(obj.addition(2, 5));
		System.out.println(obj.Substraction(7, 5));
		System.out.println(obj.greet(" Avani"));
		
		

	}

	

	}
