package logger;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String text) {
        System.out.println("Logger from console");
    }
}
