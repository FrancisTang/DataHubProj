package com.wbtc.test;

import java.util.TimerTask;

import org.apache.log4j.Logger;

//import org.apache.log4j.Logger;

import com.wbtc.utilities.CSVFileUtilities;



/**
 * @author Francis Tang
 *

 */
public class TimerFactoryTest extends TimerTask {	
	
	private static final Logger logger = Logger.getLogger(TimerFactoryTest.class);

    public void run() {
		TimerFactoryTest.runTask();
    }
	
	public static void runTask () {
		
		logger.debug("Timer1 task started");
		System.out.println("Starting Timer1 Test");
	    CSVFileUtilities insertData = new CSVFileUtilities();
	    insertData.readCSVFile();
	    System.out.println("ended Timer1 Test");
		logger.debug("Timer1 task executed");
	}
}

		

