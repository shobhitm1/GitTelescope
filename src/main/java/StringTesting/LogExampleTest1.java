package StringTesting;
import java.util.logging.Logger;

import org.apache.logging.log4j.*;

public class LogExampleTest1 {
	private static org.apache.logging.log4j.Logger log =LogManager.getLogger(LogExampleTest1.class.getName());
	public static void main(String[] args) {
		 log.fatal("Inside fatal BBBB");
		 log.info("Inside Info BBBB");
		 log.error("Inside Error BBBB");
		 log.debug("Inside Debug BBBB");
	}

}



