/**
 * 
 */

/**
 * @author Praveenkumar.S
 *
 */

// Java Program to find largest element in an array

public class TestMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test t = new Test();
		int result = t.findMax();
		System.out.println("The max number is :" + result);
	}
}

class Test{
	
	static int arr[] = {100, 150, 80, 456, 190,18000};
	static int findMax() {
		int i;
		
		int max = arr[0];
		
		for (i=0; i<arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
}
