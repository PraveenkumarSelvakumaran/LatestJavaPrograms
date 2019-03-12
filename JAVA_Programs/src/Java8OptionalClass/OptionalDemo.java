/**
 * 
 */
package Java8OptionalClass;

import java.util.Optional;

/**
 * @author Praveenkumar.S
 *
 */
public class OptionalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
/*		String[] words = new String[10];
		String word = words[5].toLowerCase();
		System.out.println(word);*/
		
		String[] words = new String[10];
		Optional<String> chkNull = Optional.ofNullable(words[5]);
		if(chkNull.isPresent()) {
			String word = words[5].toLowerCase();
			System.out.println(word);
			
		}else {
			System.out.println("Word is null");
		}
		//Word Formatting
		String id = "ART";
		String s = String.format("%1$s%2$08d", id, 42);
		System.out.println(s);
	}
}

