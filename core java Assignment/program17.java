package myfirst;

//create one thread by implementing Runnable interface in Class.

public class program17 implements Runnable {

    @Override
    public void run() 
    {
        System.out.println("Thread is running...");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		program17 obj = new program17();   // Create Runnable object
        Thread t = new Thread(obj);          // Pass it to Thread class
        t.start();                           // Start the thread

	}

}
