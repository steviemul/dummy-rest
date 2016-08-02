package atg.cloud.dummyrest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import atg.cloud.dumyrest.server.DummyServer;

/**
 * The Class App.
 */
public class App {
  
  /** The m logger. */
  private static Log mLogger = LogFactory.getLog(App.class);
  
  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    DummyServer server = new DummyServer();
    
    server.start();
    
    mLogger.info("Server Started");
  }
  
}
