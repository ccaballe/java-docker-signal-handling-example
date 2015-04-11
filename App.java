import sun.misc.Signal;
import sun.misc.SignalHandler;

public class App {
  public static void main(String[] args) {
    Signal.handle(new Signal("INT"), new SignalHandler() {
      public void handle(Signal s) {
        System.out.println("Shutting down due to SIGINT...");
        System.exit(0);
      }
    });
    Signal.handle(new Signal("TERM"), new SignalHandler() {
      public void handle(Signal s) {
        System.out.println("Shutting down due to SIGTERM...");
        System.exit(0);
      }
    });

    try {
      Thread.sleep(60000);
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }
  }
}
