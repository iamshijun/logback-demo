package chapters.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;

public class MarkerTest {
	final static Logger logger = LoggerFactory.getLogger(MarkerTest.class);

	public static void main(String[] args) {
		LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
		try {
			JoranConfigurator configurator = new JoranConfigurator();//XXX
			configurator.setContext(context);
			context.reset();
			configurator.doConfigure(args[0]);
		} catch (JoranException je) {
			// StatusPrinter will handle this
		}
		StatusPrinter.printInCaseOfErrorsOrWarnings(context);

		Marker profileMarker = MarkerFactory.getMarker("ProfileMarker");
		
		logger.info("This is a log message without marker - 1");
		logger.info(profileMarker,"This is a log message with profileMarker");
		logger.info("This is a log message without marker - 2");
	}
}