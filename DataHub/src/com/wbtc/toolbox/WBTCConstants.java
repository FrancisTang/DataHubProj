/**
 * 
 */
package com.wbtc.toolbox;


public final class WBTCConstants {

	// --------------------------------------------------------------------------------
	// TimerFactory constants
	// --------------------------------------------------------------------------------
	    // Timer Job # 1
	public static final String TIMER1_JOB_SWITCH = "OFF";
	public static final int TIMER1_JOB_START_DELAY = 1;
	public static final int TIMER1_JOB_DELAY_INTERVAL = 900;
	    // Timer Job # 2
	public static final String TIMER2_JOB_SWITCH = "ON";
	public static final int TIMER2_JOB_START_DELAY = 1;
	public static final int TIMER2_JOB_DELAY_INTERVAL = 900;
	

	// --------------------------------------------------------------------------------
	// C3P0ConnectionFactory constants
	// --------------------------------------------------------------------------------

	public static final String mysql_driver_name = "com.mysql.jdbc.Driver";
	public static final String mysql_jdbc_url= "jdbc:mysql://caleb.wycliffe.ca/testHub?";
	public static final String mysql_user_id= "master";
	public static final String mysql_password= "Bible5427?";
	public static final int	mysql_jdbc_initial_pool_size= 1;
	public static final int	mysql_jdbc_max_pool_size=5;
	public static final int	mysql_jdbc_min_pool_size=0;
	public static final int	mysql_jdbc_max_idle_time=300;
	public static final int	mysql_jdbc_checkout_timeout=6000;
	public static final int	mysql_max_connection_retry=10;
	
	// --------------------------------------------------------------------------------
	// error messages
	// --------------------------------------------------------------------------------
	public static final String error_connection_from_pool_not_available = "No connection available";
	public static final String error_connection_not_released = "No connection available";
	
	
	// --------------------------------------------------------------------------------
	// SQL statements
	// --------------------------------------------------------------------------------
	public static final String sql_insert_financial_tx = "insert into datahub.donation_tx_delta values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	
}
