package Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
	public static void main(String args[]) {
		List<Laptop> laps = new ArrayList();
		laps.add(new Laptop("Dell",15,12000));
		laps.add(new Laptop("Acer",12,6000));
		laps.add(new Laptop("Lenova",13,18000));
		
		Comparator<Laptop> com = new Comparator<Laptop>() {
			public int compare(Laptop l1, Laptop l2) {
				if(l1.getPrice()>l2.getPrice())
					return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(laps,com);
		
		for(Laptop l : laps)
		{
			System.out.println(l);
		}
	}
}
