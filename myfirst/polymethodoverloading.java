package myfirst;

public class polymethodoverloading {
	
	public void display(String name) {
		System.out.println(name);
	}
	public void display(String msg,String name) {
		System.out.println(msg+name);
	}
	public void display(String msg,String name,int age) {
		System.out.println(msg+name+age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		polymethodoverloading obg=new polymethodoverloading();
		obg.display("Yuven");
		obg.display("Avani", "Good morning");
	}

}
