package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;


public class CSVReaderUtil {
	static List<Map<String, String>> data = new ArrayList<Map<String,String>>();
	
	public static void readCSV() throws FileNotFoundException, IOException {
		CSVParser csvRecordsWithHeader = CSVFormat.DEFAULT.withHeader("FirstName", "LastName", "Email").parse(new FileReader("./src/test/resources/data/accountdetails.csv"));
		for (CSVRecord record : csvRecordsWithHeader) {
				data.add(record.toMap());
		}
	}
	
	public Map<String, String> getRandomDetails() throws FileNotFoundException, IOException {
		Random rand = new Random();
		readCSV();
		return data.get(rand.nextInt(data.size()));
	}
		
}
