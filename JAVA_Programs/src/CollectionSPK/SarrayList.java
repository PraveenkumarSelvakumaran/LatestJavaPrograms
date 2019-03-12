package CollectionSPK;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SarrayList {
	public static void main(String args[]) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Test1");
		l1.add("Test2");
		l1.add("Test3");
		l1.add("Test4");
		l1.add("Test1");
		l1.add("Test6");

		// traversal Using Iterator Interface
		Iterator itr = l1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// traversal using For each
		for (String test : l1) {
			System.out.println(test);
		}

		System.out.println("Traversing list through List Iterator:");
		// Here, element iterates in reverse order
		ListIterator<String> list1 = l1.listIterator(l1.size());
		while (list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}

		System.out.println("Traversing list through forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8.
		l1.forEach(a -> { // Here, we are using lambda expression
			System.out.println(a);
		});

		System.out.println("Traversing list through forEachRemaining() method:");
		Iterator<String> iter = l1.iterator();
		iter.forEachRemaining(b -> // Here, we are using lambda expression
		{
			System.out.println(b);
		});
	}

}
