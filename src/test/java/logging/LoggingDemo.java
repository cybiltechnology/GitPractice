package logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = LogManager.getLogger(Logger.class.getName());
		logger.debug("THis is a debug message");
		logger.fatal("THis is a fatal message");
		logger.error("THis is a error message");
		logger.warn("THis is a warn message");
		logger.info("THis is a info message");
	}

}
