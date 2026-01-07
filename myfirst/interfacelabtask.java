package myfirst;

 class creditcardpayment implements paymentmethod{
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Creditcardpayment " +amount);
	}
}
 

 class upipayments implements paymentmethod{
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("UPIpayment " +amount);
	}
}


 class cashpayments implements paymentmethod{
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("cashpayements   " +amount);
	}
}
 
public class interfacelabtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creditcardpayment ccp= new creditcardpayment();
		ccp.pay(100);
		
		upipayments up=new upipayments();
		up.pay(200.87);
		
		cashpayments cp=new cashpayments();
		cp.pay(400);
	}

}
