package modelo;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public abstract class MiLogPersonalizado {

	public static void configurar() {
		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

		Logger rootLogger = Logger.getLogger("");
		for (Handler h : rootLogger.getHandlers()) {
			if (h instanceof ConsoleHandler) {
				rootLogger.removeHandler(h);
			}
		}

		FileHandler fh1 = null;
		try {
			fh1 = new FileHandler("log.txt");
			fh1.setFormatter(new SimpleFormatter());
			logger.addHandler(fh1);
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}

	}

}
