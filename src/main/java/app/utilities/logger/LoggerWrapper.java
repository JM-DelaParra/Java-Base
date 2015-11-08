package app.utilities.logger;

import java.io.FileInputStream;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerWrapper {

	private Logger logger;

	public LoggerWrapper(Class c) {
		logger = Logger.getLogger(c);
		initializeLogger();
	}// LoggerWrapper(Class c)


	private void initializeLogger() {
		String propertiesFile = "/resources/properties/log4j.properties";
		Properties properties = new Properties();
		PropertyConfigurator propertiesConfigurator = new PropertyConfigurator();
		try {
			properties.load(LoggerWrapper.class.getResourceAsStream(propertiesFile));
			propertiesConfigurator.configure(properties);
		} catch (Exception e) {
			System.out.println(e);
		}
	}// initializeLogger()

	public void trace(String msg) {
		if (logger.isTraceEnabled()) {
			logger.trace(msg);
		}
	}// trace(String msg)

	public void debug(String msg) {
		if (logger.isDebugEnabled()) {
			logger.debug(msg);
		}
	}// debug(String msg)

	public void info(String msg) {
		if (logger.isInfoEnabled()) {
			logger.info(msg);
		}
	}// info(String msg)

	public void warn(String msg) {
		logger.warn(msg);
	}// warn(String msg)

	public void error(String msg) {
		logger.error(msg);
	}// error(String msg)

	public void fatal(String msg) {
		logger.fatal(msg);
	}// fatal(String msg)

}// LoggerWrapper
