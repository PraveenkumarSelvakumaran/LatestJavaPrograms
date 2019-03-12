/**
 * 
 */
package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author praveenkumar.s
 *
 */
public class RemoveDuplicatesUsingStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<Integer>(Arrays.asList(6,1,2,3,3,5,6,1));
		
		System.out.println("ArrayList with Duplicates: "+ lst);
		
		List<Integer> newLst = lst.stream().distinct().collect(Collectors.toList());
		
		System.out.println("ArrayList Without Duplicates: "+ newLst);

	}
}
