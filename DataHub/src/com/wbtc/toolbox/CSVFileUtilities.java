package com.wbtc.toolbox;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.wbtc.dao.MySQLAccess;
 
/**
 * @author Crunchify.com
 * 
 */
 
public class CSVFileUtilities {
	
	public BufferedReader loadCSVFile(String url) {
		
		BufferedReader crunchifyBuffer = null;
		
		try {
			crunchifyBuffer = new BufferedReader(new FileReader(url));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (crunchifyBuffer != null) crunchifyBuffer.close();
			} catch (IOException crunchifyException) {
				crunchifyException.printStackTrace();
			}
		}
		return crunchifyBuffer;
	}
	
	

	
	public void readCSVFile() {
		
		BufferedReader crunchifyBuffer = null;
		ArrayList<String> csvArrayList = null;
;
		
		try {
			String csvLine;
			crunchifyBuffer = new BufferedReader(new FileReader("c:/data/temp/testdonations.csv"));
			
			// How to read file in java line by line?
			while ((csvLine = crunchifyBuffer.readLine()) != null) {
				System.out.println("Raw CSV data: " + csvLine);
				csvArrayList = convertCSVtoArrayList(csvLine);
				System.out.println("Converted ArrayList data: " + csvArrayList + "\n");
				
			// Insert CSV data into DB (example for file operation)
			    MySQLAccess dao = new MySQLAccess();
			    dao.insertDataIntoDataHub(csvArrayList.get(0), csvArrayList.get(1));
						
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (crunchifyBuffer != null) crunchifyBuffer.close();
			} catch (IOException crunchifyException) {
				crunchifyException.printStackTrace();
			}
		}
	}
	
	// Utility which converts CSV to ArrayList using Split Operation
	public ArrayList<String> convertCSVtoArrayList(String crunchifyCSV) {
		ArrayList<String> crunchifyResult = new ArrayList<String>();
		
		if (crunchifyCSV != null) {
			String[] splitData = crunchifyCSV.split("\\s*;\\s*");
			for (int i = 0; i < splitData.length; i++) {
				if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
					crunchifyResult.add(splitData[i].trim());
				}
			}
		}
		
		return crunchifyResult;
	}
	
}
