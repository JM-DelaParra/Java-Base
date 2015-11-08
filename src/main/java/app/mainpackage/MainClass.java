package app.mainpackage;

import app.utilities.logger.LoggerWrapper;
import app.secondarypackage.SecondaryClass;

public class MainClass {

	private static final LoggerWrapper log = new LoggerWrapper(MainClass.class);

	public static void main(String [] args) {
		log.info("main(String [] args)");
		MainClass mc = new MainClass();
		mc.startMain();
	}// main(String [] args)

	public void startMain() {
		System.out.println("HI FROM MAIN");
		SecondaryClass sc = new SecondaryClass();
		sc.secondaryMethod();
		sc.secondaryMethodError();
	}// startMain()

}// MainClass