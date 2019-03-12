package CollectionSPK;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialDeserial {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");

		try {
			// Serialization
			FileOutputStream fos = new FileOutputStream("TEST");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			System.out.println(oos);
			fos.close();
			oos.close(); 
			
			System.out.println(oos);
			// Deserialization
			FileInputStream fis = new FileInputStream("file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList list = (ArrayList) ois.readObject();
			
			System.out.println(list);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
