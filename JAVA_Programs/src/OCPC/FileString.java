/**
 * 
 */
package OCPC;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * @author Praveenkumar.S
 *
 */
public class FileString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File log= new File("C:\\Users\\praveenkumar.s\\Desktop\\test.pdf");
		String search = "<Company>";
		String replace = "Digital Suppliers";
		Document document = new Document();
		PdfReader reader;
		

		try{
			
			reader = new PdfReader("C:\\Users\\praveenkumar.s\\Desktop\\test.pdf");
			
			
			
			//PdfWriter.getInstance(document, new FileOutputStream(new File(log)));
			
			
			
		    FileReader fr = new FileReader(log);
		    String s;
		    String totalStr = "";
		    try (BufferedReader br = new BufferedReader(fr)) {

		        while ((s = br.readLine()) != null) {
		            totalStr += s;
		        }
		        totalStr = totalStr.replaceAll(search, replace);
		        FileWriter fw = new FileWriter(log);
		    fw.write(totalStr);
		    fw.close();
		    }
		}catch(Exception e){
		    e.printStackTrace();
		}

	}

}
