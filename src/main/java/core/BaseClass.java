package core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class BaseClass {
	
	static Logger log = LogManager.getLogger();
	
	public abstract void execute();
	
	public void loadMain() {
		log.info("In LoadMain");
		execute();
	}
	
}
