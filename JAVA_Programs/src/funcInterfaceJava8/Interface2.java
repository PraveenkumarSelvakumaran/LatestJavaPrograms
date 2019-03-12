/**
 * 
 */
package funcInterfaceJava8;

/**
 * @author Praveenkumar.S
 *
 */
@FunctionalInterface
public interface Interface2 {

	
	void method2();
	
	//void method3();
	
	default void log(String str) {
		System.out.println("I2 logging:" + str);
		
	}
	
	default void log2(String str) {
		System.out.println("I2 logging:" + str);
		
	}
}
