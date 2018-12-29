

import java.util.Scanner;
import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		//Map content = new HashMap();
		final String payCheck = "משכורת";

		String file = "C:\\Users\\Yoni\\Downloads\\FibiSave20181227283265.csv";
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
	        String line = "";
	        while ((line = br.readLine()) != null) {
	            
	        	if ((line.split(",")[2].replace("\"", " ").trim()).equals(payCheck))
	        	{
	        		String currValue = line.split(",")[4];
		        	System.out.println(currValue);
	        	}
	        	
	        }
	    } catch (FileNotFoundException e) {
	      //Some error logging
	    }
		    }
		
	

}
