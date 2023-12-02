package java.thread;

class MyRunnableThread implements Runnable{

	public static int myCount =0;
	public MyRunnableThread() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(MyRunnableThread.myCount <10) {
			try {
				System.out.println("Expl Thread"+(++MyRunnableThread.myCount));
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception in thread"+e.getMessage());
			}
		}
	}
	
}
public class RunMyThread {

	public static void main(String[] args) {
		System.out.println("Starting the main Thread");
		MyRunnableThread mtr = new MyRunnableThread();
		Thread t = new Thread(mtr);
		t.start();
		while(MyRunnableThread.myCount <=10)
		{
			try {
				System.out.println("Main Thread"+(++MyRunnableThread.myCount));
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception in the main Thread"+e.getMessage());
			}
		}
		System.out.println("End of the Main Thread");
	}
}
