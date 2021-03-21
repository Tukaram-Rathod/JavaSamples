package bridgelabz.javasamples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG= LogManager.getLogger(App.class);
	public static void main( String[] args )
    {
		String message = "Hello World! ";
		LOG.debug(message + " Will be Printed On Debug ");
		LOG.info(message + " Will be Printed On Info ");
		LOG.warn(message + " Will be Printed On Warn ");
		LOG.error(message + " Will be Printed On Error ");
		LOG.fatal(message + " Will be Printed On Fatal ");
		LOG.info("Appending string :{}.",message);
        System.out.println( message );
		System.out.println( "Ashish" );
    }
}
