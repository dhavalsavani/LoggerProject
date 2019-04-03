package scripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import core.BaseClass;
import core.Log4jMain;

public class MainClass {
	
	static Logger log = LogManager.getLogger();
	
	public static void main(String[] args) {
		log.info("In Main method");
		
		BaseClass b = new Log4jMain();
		b.loadMain();
		
		log.info("Execution finishes");
	}

}
