package com.wbtc.toolbox;

import java.util.Timer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

import com.wbtc.toolbox.test.LoadDonationTxsInServerTest;
import com.wbtc.toolbox.test.TimerFactoryTest;




/*
 * 
 * @author Francis Tang
 *
 * TODO Set tasks for automatic timer.
 * This object will be started as a listener of ServletContext. 
 * See setup in web.xml file
 * 
 */
public class TimerFactory implements ServletContextListener	{
	
	private final Logger logger = Logger.getLogger(this.getClass());
    
	// Set up timers for various timer tasks to run in individual thread
	Timer timer1 = null;
    Timer timer2 = null;
    Timer timer3 = null;
    Timer timer4 = null;
    Timer timer5 = null;
    Timer timer6 = null;
    Timer timer7 = null;
    
    
	/* Application Startup Event */
	public void	contextInitialized(ServletContextEvent ce) {
		
		String timer1Switch = WBTCConstants.TIMER1_JOB_SWITCH;
		long timer1DelayStart = WBTCConstants.TIMER1_JOB_START_DELAY*1000;  //delay for ?? seconds before first task execution
		long timer1DelayInterval = WBTCConstants.TIMER1_JOB_DELAY_INTERVAL*1000;  //subsequent delay interval .... ?? minutes
		String timer2Switch = WBTCConstants.TIMER2_JOB_SWITCH;
		long timer2DelayStart = WBTCConstants.TIMER2_JOB_START_DELAY*1000;  //delay for ?? seconds before first task execution
		long timer2DelayInterval = WBTCConstants.TIMER2_JOB_DELAY_INTERVAL*1000;  //subsequent delay interval .... ?? minutes	
	
		
		//Setup timer job # 1
        if (timer1Switch.equals("ON")) { 
        	timer1 = new Timer();
        	timer1.schedule(new TimerFactoryTest(), timer1DelayStart, timer1DelayInterval);
        	logger.info("Timer schedule established for submitting timer job 1");
        }
		
		//Setup timer job # 12
        if (timer2Switch.equals("ON")) { 
        	timer2 = new Timer();
        	timer2.schedule(new LoadDonationTxsInServerTest(), timer2DelayStart, timer2DelayInterval);
        	logger.info("Timer schedule established for submitting timer job 2");
        } 

    
        
	}

	/* Application Shutdown	Event */
	public void	contextDestroyed(ServletContextEvent ce) {
		if (timer1 != null){
			logger.info("Trying Shutdown Timer1 ");
			timer1.cancel();
			logger.info("Timer1 is off ");
		}
		if (timer2 != null){
			logger.info("Trying Shutdown Timer2 ");
			timer2.cancel();
			logger.info("Timer2 is off ");
		}
		logger.info("All timers have been ended normally");
	}

}


 

