package ChainOfResponsibilityPattern;

public class DebugLogger extends Logger {
    DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int logLevel, String msg) {
        if (logLevel == DEBUG) {
            System.out.println("[DEBUG] "+msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
