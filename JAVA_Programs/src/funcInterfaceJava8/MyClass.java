/**
 * 
 */
package funcInterfaceJava8;

/**
 * @author Praveenkumar.S
 *
 */
public class MyClass implements Interface1, Interface2 {

	/**
	 * @param args
	 */

	@Override
	public void method2() {
				
	}

	@Override
	public void method(String str) {
				
	}

	/*public void log(String str) {
		System.out.println("My Class Logging::"+ str);
		Interface1.print("TEST");
		
	}*/
	
	@Override
	public void log(String str) {
		Interface1.super.log(str);
		Interface2.super.log(str);
	}

	public static void main(String args[]) {
		
		MyClass mc = new MyClass();
		mc.log("New Test");
		mc.method("new List");
		
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("My Runnable");
			}
		};
		
	}
}
