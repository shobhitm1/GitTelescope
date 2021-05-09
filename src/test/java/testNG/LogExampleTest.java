package testNG;
import java.util.logging.Logger;

import org.apache.logging.log4j.*;

public class LogExampleTest {
	private static org.apache.logging.log4j.Logger log =LogManager.getLogger(LogExampleTest.class.getName());
	public static void main(String[] args) {
		 log.fatal("char msg");
		 log.info("nbhjkjs");
		 log.error("nhghjgjgj");
		

	}

}



