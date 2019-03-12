/**
 * 
 */
package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Praveenkumar.S
 *
 */
public class StreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		List<Integer> lst = new ArrayList<Integer>();
		for (int i = 0; i<10; i++) {
			lst.add(i);
		}
			Stream<Integer> str = lst.stream();
			
			Iterator itr = str.iterator();
			
			/*while(itr.hasNext()) {
				System.out.println("Stream"+ itr.next());
			}*/
			//sequential stream
			Stream<Integer> sequentialStream = lst.stream();
			
			//parallel stream
			Stream<Integer> parallelStream = lst.parallelStream();
			
			//using lambda with Stream API, filter example
			Stream<Integer> highNums = parallelStream.filter(p -> p > 5);
			//using lambda in forEach
			highNums.forEach(p -> System.out.println("High Nums parallel="+p));
			
			Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 5);
			highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
	}

}
