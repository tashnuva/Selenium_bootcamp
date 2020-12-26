package Run;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logges {
public static Logger lg=Logger.getLogger(logges.class.getName());



	public static void main(String[] args) {
		// TODO Auto-generated method stub
PropertyConfigurator.configure("C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\logged.properties");
lg.info("This is our first logs for use");
	}

}
