import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
	public static void main(String args[]) {
		List<Laptop> laps = new ArrayList();
		laps.add(new Laptop("Dell",15,12000));
		laps.add(new Laptop("Acer",12,6000));
		laps.add(new Laptop("Lenova",13,18000));
		
		Collections.sort(laps);
		
		for(Laptop l : laps)
		{
			System.out.println(l);
			
		}
		
		
	}

}
