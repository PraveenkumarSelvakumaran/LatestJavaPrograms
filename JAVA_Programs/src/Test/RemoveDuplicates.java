/**
 * 
 */
package Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author praveenkumar.s
 *
 */

//Remove Duplicates from the arrayList without using set
public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		
		lst.add(0);
		lst.add(1);
		lst.add(1);
		lst.add(6);
		lst.add(2);
		lst.add(5);
		lst.add(2);
		
		Iterator<Integer> itr = lst.iterator();
		
		ArrayList<Integer> nonDuplicate = new ArrayList<Integer>();
		
		while(itr.hasNext()) {
			int duplicate = itr.next();
			
			if(nonDuplicate.contains(duplicate)) {
				//itr.remove();
			}else {
				nonDuplicate.add(duplicate);
			}
		}
		System.out.println("Before remove Duplicate: "+lst);
		System.out.println("After remove Duplicate: "+nonDuplicate);
	}
}
