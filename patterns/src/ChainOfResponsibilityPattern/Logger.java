package ChainOfResponsibilityPattern;

public abstract class Logger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    private final Logger nextLogger;

    Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(int logLevel, String msg) {
        if (nextLogger != null) {
            nextLogger.log(logLevel, msg);
        }
    }
}
