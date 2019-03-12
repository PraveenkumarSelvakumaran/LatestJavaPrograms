/**
 * 
 */
package Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Praveenkumar.S
 *
 */
public class LambdaExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		List<String> lst = new ArrayList<String>();
		lst.add("Praveen");
		lst.add("Kumar");
		lst.add("Albert");
		lst.add("Sweety");
		
		lst.forEach((test)->
		System.out.println(test));
		}
}
