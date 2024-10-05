package ChainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        logger.log(Logger.ERROR, "something went wrong");
        logger.log(Logger.DEBUG, "upgrade to latest version");
        logger.log(Logger.INFO, "user logged in");
    }
}
