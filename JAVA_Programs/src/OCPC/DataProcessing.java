/**
 * 
 */
package OCPC;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Praveenkumar.S
 *
 */
public class DataProcessing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> collection = Arrays.asList("test","template","blue", "black","test","Green","Orange","pink","test");
		
		
		Collection<List<String>> l =  partition(collection,2);
		
		//Split the list based on the size
		System.out.println(l);
		
		
		Stream<List<String>> parallelStream = l.parallelStream();
		
		parallelStream.forEach(p -> {System.out.println("High Nums parallel="+ p);
									 System.out.println("TEST");});
		
	}
	//partitioning the list into sublists
	private static  <T> Collection<List<T>> partition(List<T> list, int size) {
        final AtomicInteger counter = new AtomicInteger(0);

        return list.stream()
                .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / size))
                .values();
    }
}
