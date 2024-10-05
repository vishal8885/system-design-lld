package ChainOfResponsibilityPattern;

public class ErrorLogger extends Logger {

    ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int logLevel, String msg) {
        if (logLevel == ERROR) {
            System.out.println("[ERROR] "+msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
