package CollectionSPK;

import java.util.Iterator;
import java.util.TreeSet;

public class StreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Test6");
		ts.add("Test2");
		//ts.add("Test3");
		
		
		Iterator itr = ts.iterator();
		
		for (String s : ts) {
			System.out.println(ts);
		}
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
