package CollectionSPK;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ShashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("List1");
		al.add("List2");
		al.add("List3");
		al.add("List3");
		
		HashSet<String> hs = new HashSet<String>(al);
		hs.add("Test1");
		hs.add("Test2");
		hs.add("Test3");
		
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}
}
