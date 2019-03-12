/**
 * 
 */
package funcInterfaceJava8;

/**
 * @author Praveenkumar.S
 *
 */
//@FunctionalInterface  // An interface with exactly one abstract method becomes Functional Interface. 
public interface Interface1 {
	
	void method(String str);
	
	default void log(String str) {
		System.out.println("I1 logging"+ str);
	}
	
	static void print(String str) {
		System.out.println("Printing" + str);
	}
}
