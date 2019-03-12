/**
 * 
 */
package Test;

/**
 * @author Praveenkumar.S
 *
 */
interface Test{
	void get();
}

public class LambdaExpression1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "Praveen";

		Test t =()-> {
			System.out.println(name);
		};
		
		t.get();
	}
}
