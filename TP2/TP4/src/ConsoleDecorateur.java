public class ConsoleDecorateur extends LogDecorateur{
    public ConsoleDecorateur(Logger logger) {
        super(logger);
    }

    public void log(String log) {
        super.log(WriteInConsole(log));
    }

    public String WriteInConsole(String log) {
        System.out.println(log);
        return log;
    }
}
