package hr.logging;

public class ConsoleLogger {

    public void writeInfo(String msg) {
        System.out.print("Info: " + msg);
    }

    public void writeError(String msg, Exception e) {
        System.out.print("Info: " + msg + ";" + e);
    }
}
