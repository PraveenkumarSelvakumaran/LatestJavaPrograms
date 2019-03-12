package CollectionSPK;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Smap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> mp= new HashMap<Integer, String>();
		
		mp.put(1, "TEST1");
		mp.put(1, "TEST1");
		mp.put(1, "TEST1");
		mp.put(1, "TEST1");
		
		
		Set se = mp.entrySet();
		
		Iterator it = se.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}

		for(Map.Entry m: mp.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
	}

}
