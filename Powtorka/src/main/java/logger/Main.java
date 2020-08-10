package logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = new FileLogger();
        logger.log("Logging test");

    }
}
