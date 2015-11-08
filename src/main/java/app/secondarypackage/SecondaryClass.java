package app.secondarypackage;

import app.utilities.logger.LoggerWrapper;

public class SecondaryClass {

	private static final LoggerWrapper log = new LoggerWrapper(SecondaryClass.class);

	public void secondaryMethod() {
		System.out.println("HI FROM SECONDARY");
	}// secondaryMethod()

	public void secondaryMethodError() {
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			log.error("secondaryMethodError() -> " + e);
		}
	}// secondaryMethodError()

}// SecondaryClass