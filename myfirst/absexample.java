package myfirst;

abstract class Example21{
	abstract public void greet();
}
abstract class Account{
	 
	abstract double calculateinterest();
	
}

  class SavingAccount extends Account{
	  int n;
	  SavingAccount(int n1){
			n=n1;
		}
	@Override
	double calculateinterest() {
		// TODO Auto-generated method stub
		return n*0.4;
	}
}
  
  class CurrentAccount extends Account{
	  int n;
	  CurrentAccount(int n1){
			n=n1;
		}
		@Override
		double calculateinterest() {
			// TODO Auto-generated method stub
			return n*0.2;
		}
	}

public class absexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Example21 obj=new Example21();
	//	obj.greet();
		
		Account[] obj1=new Account[10];
		obj1[0]=new SavingAccount(2000);
		System.out.println(obj1[0].calculateinterest());
		obj1[1]=new SavingAccount(3000);
		System.out.println(obj1[1].calculateinterest());   
		obj1[2]=new CurrentAccount(3000);
		System.out.println(obj1[2].calculateinterest());


		
		 

	}

}
 