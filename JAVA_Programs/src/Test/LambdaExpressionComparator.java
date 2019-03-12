/**
 * 
 */
package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Praveenkumar.S
 *
 */
class Students{
	int id;
	String name;
	public Students(int id, String name) {
		super();
		this.id  = id;
		this.name = name;
	}
	
}

public class LambdaExpressionComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		List<Students> lst = new ArrayList<Students>();
		
		lst.add(new Students(1,"Praveen"));
		lst.add(new Students(2,"Kumar"));
		lst.add(new Students(3,"Albert"));
		lst.add(new Students(4,"Sweety"));
		lst.add(new Students(5,"Paru"));
		
		Collections.sort(lst,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		for(Students s:lst) {
			System.out.println(s.id+" "+s.name);
		}
		

	}

}
