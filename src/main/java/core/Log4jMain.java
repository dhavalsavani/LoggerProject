package core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jMain extends BaseClass{
	
	static Logger log = LogManager.getLogger();
	
	@Override
	public void execute() {
		log.trace("TRACE Message");
		log.debug("DEBUG Message");
		log.info("INFO Message");
		log.warn("WARN Message");
		log.error("ERROR Message");
		log.fatal("FATAL Message");
	}

}
