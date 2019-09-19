package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

	// Read data from a CSV file and return as a list
	public static List<String[]> read(String file) {
		List<String[]> accountHolders = new LinkedList<String[]>();
		
		BufferedReader csvReader = null;
		String row;
		try {
			csvReader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e1) { e1.printStackTrace(); }
		try {
			while ((row = csvReader.readLine()) != null) {
				String[] account = row.split(",");
				accountHolders.add(account);
			}
		} catch (IOException e) { e.printStackTrace(); }
		try {
			csvReader.close();
		} catch (IOException e) { e.printStackTrace(); }
		return accountHolders;
	}
}
