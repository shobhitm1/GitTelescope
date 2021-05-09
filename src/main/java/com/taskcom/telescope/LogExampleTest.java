package com.taskcom.telescope;
import java.util.logging.Logger;

import org.apache.logging.log4j.*;

public class LogExampleTest {
	private static org.apache.logging.log4j.Logger log =LogManager.getLogger(LogExampleTest.class.getName());
	public static void main(String[] args) {
		 log.fatal("Inside fatal");
		 log.info("Inside Info ");
		 log.error("Inside Error");
		 log.debug("Inside Debug");
	}

}



