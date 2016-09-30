package manual.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chapters.configuration.Foo;

public class MyApp2 {
	final static Logger logger = LoggerFactory.getLogger(MyApp2.class);

	public static void main(String[] args) {
		/*
		// assume SLF4J is bound to logback in the current environment
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		// print logback's internal status
		StatusPrinter.print(lc);
		//instead of programmatically invokeing StatusPrinter from your code,you can 
		//instruct the configuration file to dump status data
		//   <configuration debug="true"> ..</configuration>
		// or
		//      <statusListener class="xxx.OnConsoleStatusListener" />
		*/

		logger.info("Entering application.");

		Foo foo = new Foo();
		foo.doIt();
		logger.info("Exiting application.");
	}
}