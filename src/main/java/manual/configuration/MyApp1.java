package manual.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chapters.configuration.Foo;

public class MyApp1 {
	final static Logger logger = LoggerFactory.getLogger(MyApp1.class);

	public static void main(String[] args) {
		/*// option1
		// assume SLF4J is bound to logback in the current environment
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		// print logback's internal status
		StatusPrinter.print(lc);
		 */
		
		/*//option 2
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		StatusManager statusManager = lc.getStatusManager();
		OnConsoleStatusListener onConsoleListener = new OnConsoleStatusListener();
		statusManager.add(onConsoleListener);*/

		//Logger logger = LoggerFactory.getLogger(MyApp1.class);
		logger.info("Entering application.");

		Foo foo = new Foo();
		foo.doIt();
		logger.info("Exiting application.");
	}
}