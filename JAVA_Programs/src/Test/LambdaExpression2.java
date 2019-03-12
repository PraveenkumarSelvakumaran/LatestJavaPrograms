/**
 * 
 */
package Test;

/**
 * @author Praveenkumar.S
 *
 */
public class LambdaExpression2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Thread Example without lambda
		
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("Thread is Running");
			}
	};
	
	Thread t = new Thread(r1);
	t.start();
	
	//Thread Example with lambda
	Runnable r2 = ()->{
		System.out.println("Lambda Thread is Running");
	};
	
	Thread t2 = new Thread(r2);
	t2.start();
	}
}
